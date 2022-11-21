package com.example.SpringSecurityDemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class securityConfig extends WebSecurityConfigurerAdapter{
 
	@Autowired
	private UserDetailsService userDetails;
	
	@Bean
	AuthenticationProvider authentationProvider() {
		DaoAuthenticationProvider daoAuth=new DaoAuthenticationProvider();
		daoAuth.setUserDetailsService(userDetails);
		daoAuth.setPasswordEncoder(new BCryptPasswordEncoder());
		return daoAuth;
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/")
		.permitAll()
		.antMatchers("/home")
		.hasAuthority("USER");
		
		
		http.authorizeRequests()
		.antMatchers("/admin")
		.hasAuthority("ADMIN")
		.anyRequest()
		.authenticated()
		.and()
		.httpBasic();
	}
	
}
