package de.saxsys.dojo.tennis;

public class TennisGame {

	private int player1Score = 0;
	private int player2Score = 0;

	public String getScore() {
		String player1ScoreStr = "Love";
		String player2ScoreStr = "Love";
		if (player1Score == 1) {
			player1ScoreStr = "Fifteen";
		} else if (player1Score == 2) {
			player1ScoreStr = "Thirty";
		}
		if (player2Score > 0) {
			player2ScoreStr = "Fifteen";
		}
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
