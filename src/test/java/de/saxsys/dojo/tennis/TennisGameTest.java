package de.saxsys.dojo.tennis;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TennisGameTest {

	@Test
	public void scoreIsLoveAllAfterGameStart() {

		TennisGame tennisGame = new TennisGame();
		assertThat(tennisGame.score(), is("Love All"));
	}

	@Test
	public void scoreIsFifteenLoveAfterPlayerOneScores() {

		TennisGame tennisGame = new TennisGame();
		tennisGame.playerOneScores();
		assertThat(tennisGame.score(), is("Fifteen Love"));
	}

	@Test
	public void scoreIsThirtyLoveAfterPlayerOneScoresTwoTimes() {

		TennisGame tennisGame = new TennisGame();
		tennisGame.playerOneScores();
		tennisGame.playerOneScores();
		assertThat(tennisGame.score(), is("Thirty Love"));
	}

	@Test
	public void scoreIsFortyLoveAfterPlayerOneScoresThreeTimes() {

		TennisGame tennisGame = new TennisGame();
		tennisGame.playerOneScores();
		tennisGame.playerOneScores();
		tennisGame.playerOneScores();
		assertThat(tennisGame.score(), is("Forty Love"));
	}

	@Test
	public void scoreIsLoveFifteenAfterPlayerTwoScores() {

		TennisGame tennisGame = new TennisGame();
		tennisGame.playerTwoScores();
		assertThat(tennisGame.score(), is("Love Fifteen"));
	}

	@Test
	public void scoreIsLoveFifteenAfterPlayerTwoScoresTwoTimes() {

		TennisGame tennisGame = new TennisGame();
		tennisGame.playerTwoScores();
		tennisGame.playerTwoScores();
		assertThat(tennisGame.score(), is("Love Thirty"));
	}

	@Test
	public void scoreIsLoveFifteenAfterPlayerTwoScoresThreeTimes() {

		TennisGame tennisGame = new TennisGame();
		tennisGame.playerTwoScores();
		tennisGame.playerTwoScores();
		tennisGame.playerTwoScores();
		assertThat(tennisGame.score(), is("Love Forty"));
	}

	@Test
	public void scoreIsFifteenAllAfterBothPlayersScored() {

		TennisGame tennisGame = new TennisGame();
		tennisGame.playerOneScores();
		tennisGame.playerTwoScores();
		assertThat(tennisGame.score(), is("Fifteen All"));
	}

	@Test
	public void scoreIsPlayerOneWinsAfterPlayerOneScoresFourTimes() {

		TennisGame tennisGame = new TennisGame();
		tennisGame.playerOneScores();
		tennisGame.playerOneScores();
		tennisGame.playerOneScores();
		tennisGame.playerOneScores();
		assertThat(tennisGame.score(), is("Player One wins!"));
	}

	@Test
	public void scoreIsPlayerTwoWinsAfterPlayerTwoScoresFourTimes() {

		TennisGame tennisGame = new TennisGame();
		tennisGame.playerTwoScores();
		tennisGame.playerTwoScores();
		tennisGame.playerTwoScores();
		tennisGame.playerTwoScores();
		assertThat(tennisGame.score(), is("Player One wins!"));
	}

	@Test
	public void scoreIsDeuceAfterBothPlayersScoreThreeTimes() {

		TennisGame tennisGame = new TennisGame();
		deuce(tennisGame);
		assertThat(tennisGame.score(), is("Deuce"));
	}

	@Test
	public void scoreIsAdvantagePlayerOneAfterDeuceAndPlayerOneScores() {
		
		TennisGame tennisGame = new TennisGame();
		deuce(tennisGame);
		tennisGame.playerOneScores();
		assertThat(tennisGame.score(), is("Advantage Player One"));
	}

	@Test
	public void scoreIsAdvantagePlayerTwoAfterDeuceAndPlayerTwoScores() {
		
		TennisGame tennisGame = new TennisGame();
		deuce(tennisGame);
		tennisGame.playerTwoScores();
		assertThat(tennisGame.score(), is("Advantage Player Two"));
	}

	@Test
	public void scoreIsDeuceAfterDeuceAndBothPlayersScoreAgain() {
		
		TennisGame tennisGame = new TennisGame();
		deuce(tennisGame);
		tennisGame.playerOneScores();
		tennisGame.playerTwoScores();
		assertThat(tennisGame.score(), is("Deuce"));
	}

	private void deuce(TennisGame tennisGame) {
		tennisGame.playerOneScores();
		tennisGame.playerOneScores();
		tennisGame.playerOneScores();
		tennisGame.playerTwoScores();
		tennisGame.playerTwoScores();
		tennisGame.playerTwoScores();
	}
}
