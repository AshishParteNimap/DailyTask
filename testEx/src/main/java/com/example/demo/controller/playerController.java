package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exceptionResponse.ReaponseHandler;
import com.example.demo.model.Team;
import com.example.demo.playerDto.playerDto;
import com.example.demo.serviceImpl.playerServiceImpl;

@RestController
@RequestMapping("/player")
public class playerController {
@Autowired
private playerServiceImpl player;

//@GetMapping("/player")
//public List<Team> getAllPlayer(){
//	List<Team> team=player.getAllPlayer();
//	return team;
//}

@GetMapping
public ResponseEntity<List<playerDto>> getDto() {

		List<playerDto> players=player.getAllByDto();
		return new ResponseEntity<List<playerDto>>(players,HttpStatus.OK);
	
	
}

@GetMapping("/{id}")
public ResponseEntity<?> getPlayerById(@PathVariable("id") Long id) throws Exception {
	try {
		playerDto dto=player.getDtoById(id);
		return ReaponseHandler.getResponse("player with given Id: "+id, HttpStatus.FOUND, dto);
	} catch (Exception e) {
		return ReaponseHandler.getResponse("no player with given Id: "+id, HttpStatus.NOT_FOUND, e);
	} 
	
	
}

@GetMapping("/name")
public List<Team> getName(@RequestParam("name") String name){
	List<Team> nameOfPlayer=player.getPlayerByName(name);
	return nameOfPlayer;
}

@PostMapping
public ResponseEntity<?> addPlayer(@RequestBody Team team) {
	try {
		Team addTeam=player.addPlayer(team);
		return ReaponseHandler.getResponse("player added successfully", HttpStatus.CREATED, addTeam);
	} catch (Exception e) {
		return ReaponseHandler.getResponse("unable to add player", HttpStatus.BAD_REQUEST,null);
	}
}

@DeleteMapping("/delete/{id}")
public ResponseEntity<?> deletePlayer(@PathVariable("id")Long id) {
	 try {
		 player.deletePlayer(id);
		 return ReaponseHandler.getResponse("player deleted  successfully for id: "+id, HttpStatus.OK, id);
	} catch (Exception e) {
		return ReaponseHandler.getResponse("unable to delete player with id "+id, HttpStatus.BAD_REQUEST, null);
	} 		
}
@PutMapping("/update/{id}")
public ResponseEntity<?> updatePlaye(@PathVariable("id") Long id,@RequestBody Team team) throws Exception{
	try {
		Team playerUp=player.updatePlayer(id, team);
		return ReaponseHandler.getResponse("player updated successfully", HttpStatus.OK, playerUp);
	} catch (Exception e) {
		return ReaponseHandler.getResponse("unable to update player with id :"+id, HttpStatus.BAD_REQUEST, null);
	}	
	
}

@GetMapping("/")
public ResponseEntity<List<Team>> getPage(@RequestParam String pageNo,@RequestParam String pageSize){
	List<Team> players=player.getAllplayerByPage(pageNo, pageSize);
	return ResponseEntity.ok().body(players);
}
}
