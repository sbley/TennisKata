package de.saxsys.dojo.tennis;

public class TennisGame {

	private static final int DEUCE_SCORE_OFFSET = 1;

	private static final String[] NORMAL_SCORES = new String[] { //
	"Love", "Fifteen", "Thirty", "Forty" };

	private static final String[] DEUCE_SCORES = new String[] { //
	"Advantage Player One", "Deuce", "Advantage Player Two" };

	private int scoreOfPlayerOne = 0;

	private int scoreOfPlayerTwo = 0;

	public void playerOneScores() {
		scoreOfPlayerOne++;
	}

	public void playerTwoScores() {
		scoreOfPlayerTwo++;
	}

	public String score() {
		
		if (hasWinner()) {
			if (isPlayerOneInFront()) {
				return "Player One wins!";
			} else {
				return "Player Two wins!";
			}
		}
		if (isDeuceOrAdvantage()) {
			return DEUCE_SCORES[distanceBetweenScores() + DEUCE_SCORE_OFFSET];
		}
		if (equalScores()) {
			return NORMAL_SCORES[scoreOfPlayerOne] + " All";
		}
		return NORMAL_SCORES[scoreOfPlayerOne] + " " + NORMAL_SCORES[scoreOfPlayerTwo];
	}

	private boolean hasWinner() {
		return sumOfScores() > 3 && Math.abs(distanceBetweenScores()) >= 2;
	}

	private boolean isPlayerOneInFront() {
		return distanceBetweenScores() < 0;
	}

	private boolean isDeuceOrAdvantage() {
		return sumOfScores() > 5;
	}

	private int sumOfScores() {
		return scoreOfPlayerOne + scoreOfPlayerTwo;
	}

	private int distanceBetweenScores() {
		return scoreOfPlayerTwo - scoreOfPlayerOne;
	}

	private boolean equalScores() {
		return scoreOfPlayerOne == scoreOfPlayerTwo;
	}
}
