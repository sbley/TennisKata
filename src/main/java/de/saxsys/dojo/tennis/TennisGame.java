package de.saxsys.dojo.tennis;

public class TennisGame {

	private static final String[] SCORES = new String[] { //
	"Love", "Fifteen", "Thirty", "Forty" };

	private int scoreOfPlayerOne = 0;

	private int scoreOfPlayerTwo = 0;

	public String score() {

		if (scoreOfPlayerOne == scoreOfPlayerTwo) {
			return SCORES[scoreOfPlayerOne] + " All";
		}
		if (4 == scoreOfPlayerOne) {
			return "Player One wins!";
		}
		return SCORES[scoreOfPlayerOne] + " " + SCORES[scoreOfPlayerTwo];
	}

	public void playerOneScores() {
		scoreOfPlayerOne++;
	}

	public void playerTwoScores() {
		scoreOfPlayerTwo++;
	}
}
