package de.saxsys.dojo.tennis;

public class TennisGame {

	private static final int DISTANCE_OFFSET = 2;

	private static final String[] SCORES = new String[] { //
	"Love", "Fifteen", "Thirty", "Forty" };

	private static final String[] DEUCE_SCORES = new String[] { //
		"Player One wins!", "Advantage Player One", "Deuce", "Advantage Player Two", "Player Two wins!"};

	private int scoreOfPlayerOne = 0;

	private int scoreOfPlayerTwo = 0;

	public String score() {

		if (hasWinner()) {
			if (distanceBetweenScores()<0) {
				return "Player One wins!";				
			} else {				
				return "Player Two wins!";
			}
		}		
		if (isAtLeastDeuce()) {
			return DEUCE_SCORES[distanceBetweenScores()+DISTANCE_OFFSET];
		}		
		if (equalScores()) {
			return SCORES[scoreOfPlayerOne] + " All";
		}
		return SCORES[scoreOfPlayerOne] + " " + SCORES[scoreOfPlayerTwo];
	}

	public void playerOneScores() {
		scoreOfPlayerOne++;
	}

	public void playerTwoScores() {
		scoreOfPlayerTwo++;
	}

	private boolean isAtLeastDeuce() {
		return scoreOfPlayerOne+scoreOfPlayerTwo > 5;
	}

	private boolean hasWinner() {
		return scoreOfPlayerOne+scoreOfPlayerTwo > 3 && Math.abs(distanceBetweenScores()) >= 2;
	}
	
	private int distanceBetweenScores() {
		return scoreOfPlayerTwo-scoreOfPlayerOne;
	}

	private boolean equalScores() {
		return scoreOfPlayerOne == scoreOfPlayerTwo;
	}
}
