package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Team;
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
		Team player=repo.findById(id).orElseThrow(()-> new Exception("not found"));
		return player;
	}

	@Override
	public Team addPlayer(Team team) {
		Team player=repo.save(team);
		return player;
	}

	@Override
	public void deletePlayer(Long id)  {
		
		repo.deleteById(id);
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
	public List<Team> getAllplayerByPage(int pageNo, int pageSize) {
		Pageable pagable=PageRequest.of(pageNo, pageSize,Sort.by("id").descending());
		Page<Team> teamPage=repo.findAll(pagable);
		List<Team> players=teamPage.getContent();
		
		return players;
	}

	@Override
	public List<Team> getPlayerByName(String name) {
		List<Team> PlayerName=repo.findByName(name);
		return PlayerName;
	}

}
