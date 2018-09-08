package com.thengara.teamservice.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.thengara.teamservice.entity.Team;

public interface TeamService {
	
	
	
	
	public List<Team> findAll();
	public Team findByName(String name);
	public void save(Team team);
	void saveAll(List<Team> teams);

}
