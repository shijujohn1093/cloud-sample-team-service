package com.thengara.teamservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.thengara.teamservice.dao.TeamRepository;
import com.thengara.teamservice.entity.Team;

@Service
public class TeamServiceImpl implements TeamService{
	
	private final TeamRepository teamRepository;
	
	public TeamServiceImpl(TeamRepository teamRepository) {
		this.teamRepository = teamRepository;		
	}

	@Override
	public List<Team> findAll() {
		return teamRepository.findAll();
	}

	@Override
	public Team findByName(String name) {
		return teamRepository.findByName(name);
	}

	@Override
	public void save(Team team) {
		teamRepository.save(team);		
	}
	
	@Override
	public void saveAll(List<Team> teams) {
		teamRepository.saveAll(teams);
	}
	

	

}
