package com.stem.Scoreboard.types;

public class BaseballType {
	
	//key values
	
	private int homeScore;
	private int awayScore;
	
	private int inning;
	
	private int outs;
	private int strikes;
	private int balls;
	
	//object constructor
	
	public BaseballType(int homePoints, int awayPoints, int inningCount, int outCount, int strikeCount, int ballCount) {
			
			homeScore = homePoints;
			awayScore = awayPoints;
			inning = inningCount;
			outs = outCount;
			strikes = strikeCount;
			balls = ballCount;
			
	}
	
	//getters
	
	public int getHomeScore() {
		return homeScore;
	}
	
	public int getAwayScore() {
		return awayScore;
	}
	
	public int getInning() {
		return inning;
	}
	
	public int getOuts() {
		return outs;
	}
	
	public int getStrikes() {
		return strikes;
	}
	
	public int getBalls() {
		return balls;
	}
	
	//setters
	
	public void setHomeScore(int homePoints) {
		homeScore = homePoints;
	}
	
	public void setAwayScore(int awayPoints) {
		awayScore = awayPoints;
	}
	
	public void setInning(int inningCount) {
		inning = inningCount;
	}
	
	public void setOuts(int outCount) {
		outs = outCount;
	}
	
	public void setStrikes(int strikeCount) {
		strikes = strikeCount;
	}
	
	public void setBalls(int ballCount) {
		balls = ballCount;
	}

}
