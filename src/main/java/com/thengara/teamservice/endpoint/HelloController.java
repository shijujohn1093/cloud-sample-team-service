package com.thengara.teamservice.endpoint;

import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thengara.teamservice.entity.Player;
import com.thengara.teamservice.entity.Team;
import com.thengara.teamservice.service.TeamService;

@Controller
public class HelloController {
	
	private TeamService teamService;
	
	@Autowired
	public HelloController(TeamService teamService) {
		this.teamService= teamService;
	}
	
	
	@RequestMapping("/hi/{name}")
	public String hiThere(Map<String, String> model, @PathVariable String name) {
		model.put("name", name);
		return "hello";
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
