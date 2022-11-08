package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Team;
import com.example.demo.serviceImpl.playerServiceImpl;

@RestController
public class playerController {
@Autowired
private playerServiceImpl player;

@GetMapping("/player")
public List<Team> getAllPlayer(){
	List<Team> team=player.getAllPlayer();
	return team;
}

@GetMapping("/{id}")
public Team getPlayerById(@PathVariable("id") Long id) throws Exception {
	 Team team=player.getPlayerById(id);
	return team;
}

@GetMapping("/name")
public List<Team> getName(@RequestParam("name") String name){
	List<Team> nameOfPlayer=player.getPlayerByName(name);
	return nameOfPlayer;
}

@PostMapping("/player")
public Team addPlayer(@RequestBody Team team) {
	Team addTeam=player.addPlayer(team);
	return addTeam;
}

@DeleteMapping("/{id}")
public void deletePlayer(@PathVariable("id")Long id) {
	
	player.deletePlayer(id);		
}
@PutMapping("/{id}")
public Team updatePlaye(@PathVariable("id") Long id,@RequestBody Team team) throws Exception{
	Team playerUp=player.updatePlayer(id, team);
	return playerUp;
}

@GetMapping("/{pageNo}/{pageSize}")
public List<Team> getPage(@PathVariable("pageNo")int pageNo,@PathVariable("pageSize")int pageSize){
	List<Team> players=player.getAllplayerByPage(pageNo, pageSize);
	return players;
}
}
