package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.exceptions.NotFoundGreetingException;
import com.example.demo.rest.Greeting;

@Service
public class DemoService {
	boolean flag = false;
	public Greeting sendGreeting() {
		Greeting greeting = new Greeting("Hello bro!");
		
		if (flag) {
			throw new NotFoundGreetingException("The greeting message was not found");
		}
		
		return greeting;
	}

}
