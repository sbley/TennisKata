package de.saxsys.dojo.tennis;

public class TennisGame {

	private static final String[] SCORES = new String[] { //
	"Love", "Fifteen", "Thirty", "Forty" };

	private int scoreOfPlayerOne = 0;

	private int scoreOfPlayerTwo = 0;

	public String score() {

		if (scoreOfPlayerOne+scoreOfPlayerTwo > 5) {
			if (equalScores()) {
				return "Deuce";				
			}
		}
		
		if (4 == scoreOfPlayerOne && 3 == scoreOfPlayerTwo) {
			return "Advantage Player One";
		}
		if (3 == scoreOfPlayerOne && 4 == scoreOfPlayerTwo) {
			return "Advantage Player Two";
		}
		
		if (equalScores()) {
			return SCORES[scoreOfPlayerOne] + " All";
		}
		if (4 == scoreOfPlayerOne) {
			return "Player One wins!";
		}
		if (4 == scoreOfPlayerTwo) {
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

	private boolean equalScores() {
		return scoreOfPlayerOne == scoreOfPlayerTwo;
	}
}
