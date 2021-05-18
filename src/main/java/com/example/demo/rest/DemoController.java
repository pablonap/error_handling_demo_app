package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DemoService;

@RestController
public class DemoController {
	
	@Autowired
	DemoService demoService;

	@GetMapping("/api/demos")
	public ResponseEntity<Greeting> sayHello() {
		Greeting greeting = demoService.sendGreeting();
		return new ResponseEntity<>(greeting, HttpStatus.OK);
	}

}
