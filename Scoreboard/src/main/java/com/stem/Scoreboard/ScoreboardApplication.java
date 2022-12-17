package com.stem.Scoreboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.stem.Scoreboard.response.StringResponseObject;

@CrossOrigin(origins = "http://localhost:4200")
@SpringBootApplication
@RestController
public class ScoreboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScoreboardApplication.class, args);
	}
	
	@GetMapping("/hello")
	public StringResponseObject hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new StringResponseObject(String.format("Hello %s!", name));
	}
	
}
