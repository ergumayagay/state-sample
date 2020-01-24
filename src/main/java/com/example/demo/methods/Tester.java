package com.example.demo.methods;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tester {
	
	@Autowired
	private Map<String, State> states;
	
	public String test() {
		State s =  states.get("VALID");
		return s.process();
	}

}
