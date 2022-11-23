package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.book;

@Repository
public interface bookRepo extends JpaRepository<book, Integer>{

}
