package de.saxsys.dojo.tennis;

public class TennisGame {

	private static final String[] SCORES = new String[] { //
	"Love", "Fifteen", "Thirty", "Forty" };

	private int scoreOfPlayerOne = 0;

	private int scoreOfPlayerTwo = 0;

	public String score() {

		if (isDeuceOrAdvantage()) {
			switch (distanceBetweenScores()) {
			case 2:
				return "Player One wins!";
			case 1:
				return "Advantage Player One";
			case 0:
				return "Deuce";				
			case -1:				
				return "Advantage Player Two";
			case -2:
				return "Player Two wins!";
			}
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


	private boolean isDeuceOrAdvantage() {
		return scoreOfPlayerOne+scoreOfPlayerTwo > 5;
	}

	private int distanceBetweenScores() {
		return scoreOfPlayerOne-scoreOfPlayerTwo;
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
