package de.saxsys.dojo.tennis;

/**
 * @author stefan
 */
public class TennisGame {

	private static final String[] SCORES = new String[] { "Love", "Fifteen",
			"Thirty", "Fourty" };
	private int player1Score = 0;
	private int player2Score = 0;
	private final String player1;
	private final String player2;

	public TennisGame(String player1, String player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void player1Scores() {
		player1Score++;
	}

	public void player2Scores() {
		player2Score++;
	}

	public String getScore() {
		if (isWinPlayer1()) {
			return player1 + " wins";
		}
		if (isWinPlayer2()) {
			return player2 + " wins";
		}
		if (isDeuce()) {
			return "Deuce";
		}
		if (isAdvantagePlayer1()) {
			return "Advantage " + player1;
		}
		if (isAdvantagePlayer2()) {
			return "Advantage " + player2;
		}
		if (haveEqualScore()) {
			return asString(player1Score) + " all";
		}
		return asString(player1Score) + " " + asString(player2Score);
	}

	private boolean isWinPlayer1() {
		return player1Score >= 4 && player1Score - player2Score >= 2;
	}

	private boolean isWinPlayer2() {
		return player2Score >= 4 && player2Score - player1Score >= 2;
	}

	private boolean isDeuce() {
		return player1Score >= 3 && haveEqualScore();
	}

	private boolean isAdvantagePlayer1() {
		return player1Score >= 4 && (player1Score - player2Score) == 1;
	}

	private boolean isAdvantagePlayer2() {
		return player2Score >= 4 && (player2Score - player1Score) == 1;
	}

	private boolean haveEqualScore() {
		return player1Score == player2Score;
	}

	private static String asString(int score) {
		return SCORES[score];
	}
}
