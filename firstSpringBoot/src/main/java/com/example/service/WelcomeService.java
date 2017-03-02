package com.example.service;

import org.springframework.stereotype.Component;

@Component
public class WelcomeService {
	public String retrieveWelcomeMessage(){
		return "Good Morning! at 5 PM";
	}
}
