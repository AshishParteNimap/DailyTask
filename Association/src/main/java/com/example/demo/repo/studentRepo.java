package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.student;
@Repository
public interface studentRepo extends JpaRepository<student, Integer>{

}
