package com.thengara.teamservice.endpoint;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@Value("${test.env.key}")
	private String envKey;
	
	
	private final Environment environment;
	


	@Autowired
	public HelloController(Environment environment) {
		this.environment = environment;
	}
	
	
	@RequestMapping("/hi/{name}")
	public String hiThere(Map<String, String> model, @PathVariable String name) {
		model.put("name", name);
		return "hello";
	}
	

	
	@RequestMapping("/testKey")
	public String testKey() {
		
		return envKey +"~"+environment.getProperty("test.env.key");
	}

}
