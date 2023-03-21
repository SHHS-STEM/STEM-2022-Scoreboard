package com.stem.Scoreboard.types;

public class VolleyballType {
	
	//key values
	
	private int homeScore;
	private int awayScore;
	
	private int set;
	private int homeSets;
	private int awaySets;
	
	//object constructor
	
	public VolleyballType(int homePoints, int awayPoints, int setNum, int homeSetsWon, int awaySetsWon) {
		
		homeScore = homePoints;
		awayScore = awayPoints;
		set = setNum;
		homeSets = homeSetsWon;
		awaySets = awaySetsWon;
		
	}
	
	//getters
	
	public int getHomeScore() {
		return homeScore;
	}
	
	public int getAwayScore() {
		return awayScore;
	}
	
	public int getHomeSets() {
		return homeSets;
	}
	
	public int getAwaySets() {
		return awaySets;
	}
	
	public int getSetNumber() {
		return set;
	}
	
	
	//setters
	
	public void setHomeScore(int homePoints) {
		homeScore = homePoints;
	}
	
	public void setAwayScore(int awayPoints) {
		awayScore = awayPoints;
	}
	
	public void setHomeSets(int homeSetsWon) {
		homeSets = homeSetsWon;
	}
	
	public void setAwaySets(int awaySetsWon) {
		awaySets = awaySetsWon;
	}
	
	public void setSet(int setNum) {
		set = setNum;
	}

}
