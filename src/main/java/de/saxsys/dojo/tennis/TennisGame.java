package de.saxsys.dojo.tennis;

public class TennisGame {

	private int wins = 0;

	public String score() {
		String score = "Love All";
		if (1 == wins) {
			score = "Fifteen Love";
		} else if (2 == wins) {
			score = "Thirty Love";
		}
		return score;
	}

	public void playerOneScores() {
		wins ++;
	}

}
