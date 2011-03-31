package de.saxsys.dojo.tennis;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class TennisGameTest {

	@Test
	public void scoreIsLoveAllAfterGameStart() throws Exception {
		
		TennisGame tennisGame = new TennisGame();
		assertThat(tennisGame.score(), is("Love All"));
	}

	@Test
	public void scoreIsFifteenLoveAfterPlayerOneScores() throws Exception {
		
		TennisGame tennisGame = new TennisGame();
		tennisGame.playerOneScores();
		assertThat(tennisGame.score(), is("Fifteen Love"));
	}

	@Test
	public void scoreIsThirtyLoveAfterPlayerOneScoresTwoTimes() throws Exception {
		
		TennisGame tennisGame = new TennisGame();
		tennisGame.playerOneScores();
		tennisGame.playerOneScores();
		assertThat(tennisGame.score(), is("Thirty Love"));
	}

	@Test
	public void scoreIsFortyLoveAfterPlayerOneScoresTwoTimes() throws Exception {
		
		TennisGame tennisGame = new TennisGame();
		tennisGame.playerOneScores();
		tennisGame.playerOneScores();
		tennisGame.playerOneScores();
		assertThat(tennisGame.score(), is("Forty Love"));
	}
}
