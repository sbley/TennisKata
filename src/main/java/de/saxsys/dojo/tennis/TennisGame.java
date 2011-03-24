package de.saxsys.dojo.tennis;

public class TennisGame {

	private int player1Scores = 0;
	private int player2Scores = 0;

	public String getScore() {
		if (player1Scores > 0) {
			if (player2Scores > 0) {
				return "Fifteen all";
			}
			return "Fifteen Love";
		}
		return "Love all";
	}

	public void player1Scores() {
		player1Scores++;
	}

	public void player2Scores() {
		player2Scores++;
	}

}
