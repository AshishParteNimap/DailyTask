package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Team;

public interface PlayerService {
	public List<Team> getAllPlayer();
	
	public Team getPlayerById(Long id) throws Exception;
	
	public List<Team> getAllplayerByPage(int pageNo,int pageSize);
	
	public List<Team> getPlayerByName(String name);
	
	public Team addPlayer(Team team);
	
	public void deletePlayer(Long id) throws Exception;
	
	public Team updatePlayer(Long id,Team team) throws Exception;

}
