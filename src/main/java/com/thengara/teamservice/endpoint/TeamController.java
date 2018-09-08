package com.thengara.teamservice.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thengara.teamservice.entity.Team;
import com.thengara.teamservice.service.TeamService;

@RestController
@RequestMapping("/team")
public class TeamController {

	@Value("${test.env.key}")
	private String envKey;
	
	@Autowired
	private final Environment environment;
	
	private final TeamService teamService;

	public TeamController(TeamService teamService, Environment environment) {
		this.teamService = teamService;
		this.environment = environment;
	}

	@RequestMapping("/findateam")
	public Team findATeam() {
		return teamService.findAll().get(0);
	}

	@RequestMapping("/findbyname/{name}")
	public Team findByName(@PathVariable String name) {
		return teamService.findByName(name);
	}
	
	@RequestMapping("/testKey")
	public String testKey() {
		
		return envKey +"~"+environment.getProperty("test.env.key");
	}


}
