package com.thengara.teamservice.endpoint;

import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thengara.teamservice.entity.Player;
import com.thengara.teamservice.entity.Team;
import com.thengara.teamservice.service.TeamService;

@RestController
@RequestMapping("/team")
public class TeamController {

	@Value("${test.env.key}")
	private String envKey;
	

	
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
	
	
	@PostConstruct
	private void init() {
		Set<Player> players = new java.util.HashSet<>();
		players.add(new Player("Shju", "Goal Keeper"));
		players.add(new Player("Ethan", "Defender"));
		players.add(new Player("Bincy", "Mid Fielder"));
		Team team = new Team("Thengara", "Delhi", "Delhi Club", players);

		teamService.save(team);
	}



}
