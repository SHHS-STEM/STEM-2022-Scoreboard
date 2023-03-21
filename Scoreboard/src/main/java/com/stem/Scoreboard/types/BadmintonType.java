package com.stem.Scoreboard.types;

public class BadmintonType {
	
	//key values
	
	private int homeScore;
	private int awayScore;
	
	//object constructor
	
	public BadmintonType(int homePoints, int awayPoints) {
		
		homeScore = homePoints;
		awayScore = awayPoints;
		
	}
	
	//getters
	
	public int getHomeScore() {
		return homeScore;
	}
	
	public int getAwayScore() {
		return awayScore;
	}
	
	//setters
	
	public void setHomeScore(int homePoints) {
		homeScore = homePoints;
	}
	
	public void setAwayScore(int awayPoints) {
		awayScore = awayPoints;
	}

}
