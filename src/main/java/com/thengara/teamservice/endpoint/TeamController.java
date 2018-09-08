package com.thengara.teamservice.endpoint;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thengara.teamservice.entity.Team;
import com.thengara.teamservice.service.TeamService;

@RestController
@RequestMapping("/team")
public class TeamController {

	private final TeamService teamService;

	public TeamController(TeamService teamService) {
		this.teamService = teamService;
	}

	@RequestMapping("/findateam")
	public Team findATeam() {
		return teamService.findAll().get(0);
	}

	@RequestMapping("/findbyname/{name}")
	public Team findByName(@PathVariable String name) {
		return teamService.findByName(name);
	}


}
