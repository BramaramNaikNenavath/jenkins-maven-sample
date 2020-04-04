package com.tek.samplecontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class Sample {
	
	private static final Logger log = LoggerFactory.getLogger(Sample.class);
	
	@RequestMapping("/health")
	public String healthCheck() {
		log.info(" SAMPLE CLASS :: Checking service health");
		return "OK";
	}
	
	@GetMapping("/sample")
	public String getSampleMessage() {
		log.info("SAMPLE CLASS :: invoking getSampleMessage()");
		return "Jenkins Maven GIT Integrated Successfull";
	}
}
