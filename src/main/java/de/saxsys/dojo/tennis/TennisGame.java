package de.saxsys.dojo.tennis;

public class TennisGame {

	private static final String[] SCORES = new String[] { "Love", "Fifteen",
			"Thirty" };
	private int player1Score = 0;
	private int player2Score = 0;

	public String getScore() {
		String player1ScoreStr = "Love";
		String player2ScoreStr = "Love";
		player1ScoreStr = SCORES[player1Score];
		player2ScoreStr = SCORES[player2Score];
		if (player1Score == player2Score) {
			return player1ScoreStr + " all";
		}
		return player1ScoreStr + " " + player2ScoreStr;
	}

	public void player1Scores() {
		player1Score++;
	}

	public void player2Scores() {
		player2Score++;
	}

}
