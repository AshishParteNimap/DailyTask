package com.example.demo.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.example.demo.model.Team;
import com.example.demo.playerDto.playerDto;
import com.example.demo.repo.PlayerRepo;
import com.example.demo.service.PlayerService;

@Service
public class playerServiceImpl implements PlayerService{

	@Autowired
	private PlayerRepo repo;
	
	
	@Override
	public List<Team> getAllPlayer() {
		List<Team> getTeam=repo.findAll();
		return getTeam;
	}

	@Override
	public Team getPlayerById(Long id) throws Exception {
		Team player=repo.findById(id).orElseThrow(()->new Exception());
		return player;
	}

	@Override
	public Team addPlayer(Team team) {
		Team player=repo.save(team);
		return player;
	}

	@Override
	public String deletePlayer(Long id) throws Exception  {
		Team team=repo.findById(id).orElse(null);       // orElseThrow(()->new noSuchPlayer("no such player with number "+id));
		if(team==null) {
			throw new Exception();
		}else {
			
		repo.deleteById(id);
		return "deleted";
		}
	}

	@Override
	public Team updatePlayer(Long id, Team team)throws Exception {
		Team team2=repo.findById(id).orElseThrow(()->new Exception("canot update"));
		team2.setId(team.getId());
		team2.setName(team.getName());
		team2.setRole(team.getRole());
		repo.save(team2);
		
		return team2;
	}

	@Override
	public List<Team> getAllplayerByPage(String pageNo, String pageSize) {
		Pageable pagable=PageRequest.of(Integer.parseInt(pageNo)-1  ,Integer.parseInt(pageSize) ,Sort.by("id").descending());
		Page<Team> teamPage=repo.findAll(pagable);
		List<Team> players=teamPage.getContent();
		
		return players;
	}

	@Override
	public List<Team> getPlayerByName(String name) {
		List<Team> PlayerName=repo.findByName(name);
		return PlayerName;
	}

	

	@Override
	public List<playerDto> getAllByDto() {
		List<Team> team=this.repo.findAll();
		List<playerDto> players=new ArrayList<>();
		for(int i=0;i<team.size();i++) {
			playerDto playerDto=new playerDto();
			playerDto.setId(team.get(i).getId());
			playerDto.setName(team.get(i).getName());
			playerDto.setRole(team.get(i).getRole());
			players.add(playerDto);
		}
		return players;
	}

	@Override
	public playerDto getDtoById(Long id) throws Exception {
		Team team=this.repo.findById(id).orElseThrow(()->new Exception());
		playerDto dto=new playerDto();
		dto.setId(team.getId());
		dto.setName(team.getName());
		dto.setRole(team.getRole());
		return dto;
	}

}
