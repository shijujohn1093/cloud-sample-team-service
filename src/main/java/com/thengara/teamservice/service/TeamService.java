package com.thengara.teamservice.service;

import java.util.List;

import com.thengara.teamservice.entity.Team;

public interface TeamService {
	
	
	
	
	public List<Team> findAll();
	public Team findByName(String name);
	public void save(Team team);
	void saveAll(List<Team> teams);

}
