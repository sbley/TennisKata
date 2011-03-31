package de.saxsys.dojo.tennis;

public class TennisGame {

	private static final String[] SCORES = new String[] { //
	"Love All", "Fifteen Love", "Thirty Love", "Forty Love" };

	private int scoreOfPlayerOne = 0;

	private int scoreOfPlayerTwo = 0;

	public String score() {

		if (0 == scoreOfPlayerTwo) {
			return SCORES[scoreOfPlayerOne];
		}
		return "Love Fifteen";
	}

	public void playerOneScores() {
		scoreOfPlayerOne++;
	}

	public void playerTwoScores() {
		scoreOfPlayerTwo++;
	}
}
