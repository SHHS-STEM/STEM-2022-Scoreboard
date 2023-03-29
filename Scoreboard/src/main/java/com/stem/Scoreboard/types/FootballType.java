package com.stem.Scoreboard.types;

public class FootballType {
	
	//key values
	
	private int homeScore;
	private int awayScore;
	
	private int quarter;
	private int time;
	
	private int down;
	private int distance;
	
	//object constructor
	
	public FootballType(int homePoints, int awayPoints, int quarterNum, int timer, int downCount, int distanceCount) {
			
			homeScore = homePoints;
			awayScore = awayPoints;
			quarter = quarterNum;
			time = timer;
			down = downCount;
			distance = distanceCount;
			
	}
	
	//getters
	
	public int getHomeScore() {
		return homeScore;
	}
	
	public int getAwayScore() {
		return awayScore;
	}
	
	public int getQuarter() {
		return quarter;
	}
	
	public int getTime() {
		return time;
	}
	
	public int getDown() {
		return down;
	}
	
	public int getDistance() {
		return distance;
	}
	
	//setters
	
	public void setHomeScore(int homePoints) {
		homeScore = homePoints;
	}
	
	public void setAwayScore(int awayPoints) {
		awayScore = awayPoints;
	}
	
	public void setQuarter(int quarterNum) {
		quarter = quarterNum;
	}
	
	public void setTime(int timer) {
		time = timer;
	}
	
	public void setDown(int downCount) {
		down = downCount;
	}
	
	public void setDistance(int distanceCount) {
		distance = distanceCount;
	}

}
