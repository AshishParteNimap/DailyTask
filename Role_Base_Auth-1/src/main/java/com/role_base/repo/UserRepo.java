package com.role_base.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.role_base.model.User;
@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

	Optional<User> findByUsername(@RequestParam String username);

}
