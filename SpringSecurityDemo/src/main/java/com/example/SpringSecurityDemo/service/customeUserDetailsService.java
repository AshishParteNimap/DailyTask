package com.example.SpringSecurityDemo.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.SpringSecurityDemo.model.User;
import com.example.SpringSecurityDemo.model.customeUserDetails;
import com.example.SpringSecurityDemo.repository.userRepo;

@Service
public class customeUserDetailsService implements UserDetailsService{

	@Autowired
	private userRepo Urepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=Urepo.findByUsername(username);
		if (user==null) {
			throw new UsernameNotFoundException("not found"+username);
			
		}
		return new customeUserDetails(user);
	}

}
