package com.zuul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZuulController {
	
	@Autowired
	private Environment env;
	
	@GetMapping("/")
	public String home() {
		
		return " Default message Zuul:"+env.getProperty("local.server.port");
	}

}
