package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.jwtReponse;
import com.example.demo.config.jwtRequest;
import com.example.demo.config.jwtUtil;
import com.example.demo.service.jwtDetailService;

@RestController
@CrossOrigin
public class jwController {

	@Autowired
	private AuthenticationManager manager;
	
	@Autowired
	private jwtUtil jwtTokenUtil;
	
	
	@Autowired
	private jwtDetailService userDetailsService;
	
	@PostMapping("/authenticate")
	public ResponseEntity<?> createUserToken(@RequestBody jwtRequest authenticationRequest)throws Exception{
	//testing System.out.println("test1"); 
	authenticate(authenticationRequest.getUsername(),authenticationRequest.getPassword());
	//testing operation System.out.println("test2");
	  final UserDetails userDetails=userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
	 final String token=jwtTokenUtil.generateToken(userDetails);
	  return ResponseEntity.ok(new jwtReponse(token));
		
		
	}

	private void authenticate(String username, String password) throws Exception {
		try {
			manager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		} catch (DisabledException e) {
			throw new Exception("user blocked",e);
		}catch (BadCredentialsException e) {
			throw new Exception("invalid credentials",e);
		}
		
	}
}
