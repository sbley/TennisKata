package de.saxsys.dojo.tennis;

public class TennisGame {

	private static final String[] SCORES = new String[] { "Love", "Fifteen",
			"Thirty", "Fourty" };
	private int player1Score = 0;
	private int player2Score = 0;

	public void player1Scores() {
		player1Score++;
	}

	public void player2Scores() {
		player2Score++;
	}

	public String getScore() {
		if (isDeuce()) {
			return "Deuce";
		}
		String player1ScoreStr = asString(player1Score);
		String player2ScoreStr = asString(player2Score);
		if (haveEqualScore()) {
			return player1ScoreStr + " all";
		}
		return player1ScoreStr + " " + player2ScoreStr;
	}

	private boolean isDeuce() {
		return player1Score == 3 && player2Score == 3;
	}

	private boolean haveEqualScore() {
		return player1Score == player2Score;
	}

	private static String asString(int score) {
		return SCORES[score];
	}
}
