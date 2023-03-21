package com.stem.Scoreboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stem.Scoreboard.response.StringResponseObject;

import com.stem.Scoreboard.types.BadmintonType;
import com.stem.Scoreboard.types.BaseballType;
import com.stem.Scoreboard.types.FootballType;
import com.stem.Scoreboard.types.RugbyType;
import com.stem.Scoreboard.types.SoccerType;
import com.stem.Scoreboard.types.VolleyballType;

@CrossOrigin
@SpringBootApplication
@RestController
public class ScoreboardApplication {
	
	//key values
	
	private StringResponseObject scoreboardType;
	
	private BadmintonType badminton;
	private VolleyballType volleyball;
	private SoccerType soccer;
	private RugbyType rugby;
	private FootballType football;
	private BaseballType baseball;
	
	//getters
	
	@GetMapping("/getBadminton")
	public BadmintonType getBadminton() {
		return badminton;
	}
	
	@GetMapping("/getVolleyball")
	public VolleyballType getVolleyball() {
		return volleyball;
	}
	
	@GetMapping("/getSoccer")
	public SoccerType getSoccer() {
		return soccer;
	}
	
	@GetMapping("/getRugby")
	public RugbyType getRugby() {
		return rugby;
	}
	
	@GetMapping("/getFootball")
	public FootballType getFootball() {
		return football;
	}
	
	@GetMapping("/getBaseball")
	public BaseballType getBaseball() {
		return baseball;
	}
	
	@GetMapping("/getType")
	public StringResponseObject getType() {
		return scoreboardType;
	}
	
	//setters
	
	@PostMapping("/setBadminton")
	public void setBadminton(@RequestBody BadmintonType temp) {
		badminton = temp;
	}
	
	@PostMapping("/setVolleyball")
	public void setVolleyball(VolleyballType temp) {
		volleyball = temp;
	}
	
	@PostMapping("/setSoccer")
	public void setSoccer(SoccerType temp) {
		soccer = temp;
	}
	
	@PostMapping("/setRugby")
	public void setRugby(RugbyType temp) {
		rugby = temp;
	}
	
	@PostMapping("/setFootball")
	public void setFootball(FootballType temp) {
		football = temp;
	}
	
	@PostMapping("/setBaseball")
	public void setBaseball(BaseballType temp) {
		baseball = temp;
	}
	
	@PutMapping("/setType")
	public void setType(@RequestBody String temp) {
		scoreboardType = new StringResponseObject(temp);
	}
	
	//main method
	
	public static void main(String[] args) {
		SpringApplication.run(ScoreboardApplication.class, args);
	}
	
}