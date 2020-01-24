package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.methods.Invalid;
import com.example.demo.methods.State;
import com.example.demo.methods.Tester;
import com.example.demo.methods.Valid;

@SpringBootApplication
public class StateSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(StateSampleApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(Tester tester) {
		return args -> {
			System.out.print(tester.test());
		};
	
	}
	
	@Bean
	public Map<String, State> states(){
		Map<String, State> states = new HashMap<>();
		states.put("VALID", new Valid());
		states.put("INVALID", new Invalid());
		return states;
	}	
}


