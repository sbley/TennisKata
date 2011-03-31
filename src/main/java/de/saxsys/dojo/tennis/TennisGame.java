package de.saxsys.dojo.tennis;

public class TennisGame {

	private static final String[] SCORES = new String[] { //
	"Love", "Fifteen", "Thirty", "Forty" };

	private static final String[] DEUCE_SCORES = new String[] { //
		"Player One wins!", "Advantage Player One", "Deuce", "Advantage Player Two", "Player Two wins!"};

	private int scoreOfPlayerOne = 0;

	private int scoreOfPlayerTwo = 0;

	public String score() {

		if (isDeuceOrAdvantage()) {
			return DEUCE_SCORES[distanceBetweenScores()+2];
		}
		
		if (equalScores()) {
			return SCORES[scoreOfPlayerOne] + " All";
		}
		if (4 == scoreOfPlayerOne) {
			return "Player One wins!";
		}
		if (4 == scoreOfPlayerTwo) {
			return "Player Two wins!";
		}

		return SCORES[scoreOfPlayerOne] + " " + SCORES[scoreOfPlayerTwo];
	}

	public void playerOneScores() {
		scoreOfPlayerOne++;
	}

	public void playerTwoScores() {
		scoreOfPlayerTwo++;
	}

	private boolean isDeuceOrAdvantage() {
		return scoreOfPlayerOne+scoreOfPlayerTwo > 5;
	}

	private int distanceBetweenScores() {
		return scoreOfPlayerTwo-scoreOfPlayerOne;
	}

	private boolean equalScores() {
		return scoreOfPlayerOne == scoreOfPlayerTwo;
	}
}
