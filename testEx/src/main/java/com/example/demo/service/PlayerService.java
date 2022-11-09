package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Team;
import com.example.demo.playerDto.playerDto;

public interface PlayerService {
	public List<Team> getAllPlayer();
	
	public Team getPlayerById(Long id) throws Exception;

	public List<playerDto> getAllByDto();
	
	public playerDto getDtoById(Long id) throws Exception;
	
	public List<Team> getAllplayerByPage(String pageNo,String pageSize);
	
	public List<Team> getPlayerByName(String name);
	
	public Team addPlayer(Team team);
	
	public String deletePlayer(Long id) throws Exception;
	
	public Team updatePlayer(Long id,Team team) throws Exception;

}
