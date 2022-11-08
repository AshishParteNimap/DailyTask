package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Team;

@Repository
public interface PlayerRepo extends JpaRepository<Team, Long>{
List<Team> findByName(String name);
}
