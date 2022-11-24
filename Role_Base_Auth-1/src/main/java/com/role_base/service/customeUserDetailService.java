package com.role_base.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.role_base.model.CustomeUser;
import com.role_base.model.User;
import com.role_base.repo.UserRepo;

@Service
public class customeUserDetailService implements UserDetailsService{

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> user= userRepo.findByUsername(username);
		return user.map(CustomeUser::new).orElseThrow(()->new UsernameNotFoundException(username));
	}

}
