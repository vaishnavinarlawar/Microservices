package com.fusiontech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller1 {

	@Autowired
	RestTemplate resttrmp;

	@GetMapping("/hello")
	public String getData() {
		ResponseEntity<String> rt = resttrmp.exchange("http://localhost:8888/hii", HttpMethod.GET, null, String.class);
		String a = rt.getBody();

		return "Hello I am in microservices  = " + a;

	}

}
