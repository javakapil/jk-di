package com.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements IGreetingService{

	@Override
	public String sayGreeting() {
		
		return "Hello Greetings - Property";
	}

}
