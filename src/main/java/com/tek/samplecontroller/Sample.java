package com.tek.samplecontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class Sample {
	
	@RequestMapping("/health")
	public String healthCheck() {
		return "OK";
	}
	
	@GetMapping("/sample")
	public String registerEmployee() {
		return "Jenkins Maven GIT Integrated Successfull";
	}
}
