package com.role_base.controller;

import java.security.Principal;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.role_base.config.UserSecurityConfig;
import com.role_base.model.User;
import com.role_base.model.userConstants;
import com.role_base.repo.UserRepo;

@RestController
@RequestMapping("/user")
public class userController {

	

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private UserSecurityConfig conf;
	
	
	@PostMapping("/addUser")
	@PreAuthorize("hasAuthority('SUPER_ADMIN')")
	public String addUser(@RequestBody User user) {
		user.setRoles(userConstants.DEFAULT_ROLE);
		String pass=user.getPassword();
		String encryptPass=conf.pssEncode().encode(pass);
		user.setPassword(encryptPass);
		userRepo.save(user);
		return "Hi "+user.getUsername()+" wellcome to the club";
		
	}
	@PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_MODERATOR')")
	@GetMapping("/access/{userId}/{userRole}")
	public String giveAcess(@PathVariable int userId,@PathVariable  String userRole, Principal principle) {
		User user=userRepo.findById(userId).get();
		List<String> activeRole=getRoleOdLoggedInUser(principle);
		String newRole;
		if (activeRole.contains(userRole)) {
			newRole= user.getRoles()+","+userRole;
			user.setRoles(newRole);
		}
		userRepo.save(user);
		return "new role assign to "+principle.getName();
	}
	
	private List<String> getRoleOdLoggedInUser(Principal principle){
		String roles=getLoggedInUser(principle).getRoles();
		List<String> assignRoles=Arrays.stream(roles.split(",")).collect(Collectors.toList());
		
		if (assignRoles.contains("ROLE_ADMIN")) {
			return Arrays.stream(userConstants.ADMIN_ACCESS).collect(Collectors.toList());
		}
		if (assignRoles.contains("ROLE_MODERATOR")) {
			return Arrays.stream(userConstants.MODERATOR_ACCESS).collect(Collectors.toList());
		}
		return Collections.emptyList();
	}
	
	private User getLoggedInUser(Principal principle) {
		return userRepo.findByUsername(principle.getName()).get();
	}
	@GetMapping
	@Secured("ROLE_ADMIN")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public List<User> getUser(){
		return userRepo.findAll();
	}
	@GetMapping("/test")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public String test() {
		return "Gorilla testing";
	}
}
