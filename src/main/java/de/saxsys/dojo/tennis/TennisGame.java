package de.saxsys.dojo.tennis;

public class TennisGame {

	private int player1Scores = 0;

	public String getScore() {
		if (player1Scores>0) {
			return "Fifteen Love";
		} 
		return "Love all";
	}

	public void player1Scores() {
		player1Scores++;
	}

}
