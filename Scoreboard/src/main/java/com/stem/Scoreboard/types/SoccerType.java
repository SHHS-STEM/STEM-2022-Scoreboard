package com.stem.Scoreboard.types;

public class SoccerType {
	
	//key values
	
	private int homeScore;
	private int awayScore;
	
	private int half;
	private int time;
	
	//object constructor
	
	public SoccerType(int homePoints, int awayPoints, int halfNum, int timer) {
			
			homeScore = homePoints;
			awayScore = awayPoints;
			half = halfNum;
			time = timer;
			
	}
	
	//getters
	
	public int getHomeScore() {
		return homeScore;
	}
	
	public int getAwayScore() {
		return awayScore;
	}
	
	public int getHalf() {
		return half;
	}
	
	public int getTime() {
		return time;
	}
	
	//setters
	
	public void setHomeScore(int homePoints) {
		homeScore = homePoints;
	}
	
	public void setAwayScore(int awayPoints) {
		awayScore = awayPoints;
	}
	
	public void setHalf(int halfNum) {
		half = halfNum;
	}
	
	public void setTime(int timer) {
		time = timer;
	}

}
