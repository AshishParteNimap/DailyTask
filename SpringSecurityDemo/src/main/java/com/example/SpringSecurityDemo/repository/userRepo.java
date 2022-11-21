package com.example.SpringSecurityDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringSecurityDemo.model.User;

public interface userRepo extends JpaRepository<User, Integer>{
	User findByUsername(String username);
}
