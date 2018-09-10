package com.thengara.teamservice.endpoint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.shared.Application;
import com.netflix.discovery.shared.Applications;
import com.thengara.teamservice.service.TeamService;

@RestController
@RequestMapping("/team")
public class HealthController {

	@Value("${test.env.key}")
	private String envKey;
	
	
	private final Environment environment;
	

	private final TeamService teamService;

	@Autowired
	public HealthController(TeamService teamService, Environment environment) {
		this.teamService = teamService;
		this.environment = environment;
	}


	
	@RequestMapping("/testKey")
	public String testKey() {
		
		return envKey +"~"+environment.getProperty("test.env.key");
	}
	
	



}
