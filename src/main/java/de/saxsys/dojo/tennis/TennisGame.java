package de.saxsys.dojo.tennis;

public class TennisGame {

	private static final String[] SCORES = new String[] { //
	"Love All", "Fifteen Love", "Thirty Love", "Forty Love" };

	private int wins = 0;

	public String score() {
		return SCORES[wins];
	}

	public void playerOneScores() {
		wins++;
	}

}
