package de.saxsys.dojo.tennis;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TennisGameTest {

	@Test
	public void getScore_returnsLoveAllAfterGameStarts() throws Exception {
		assertThat(new TennisGame("P1", "P2").getScore(),
				is(equalTo("Love all")));
	}

	@Test
	public void getScore_returnsFifteenLoveAfterP1Scores() throws Exception {
		TennisGame game = new TennisGame("P1", "P2");
		game.player1Scores();
		assertThat(game.getScore(), is(equalTo("Fifteen Love")));
	}

	@Test
	public void getScore_returnsFifteenAllAfterBothScoreOnce() throws Exception {
		TennisGame game = new TennisGame("P1", "P2");
		game.player1Scores();
		game.player2Scores();
		assertThat(game.getScore(), is(equalTo("Fifteen all")));
	}

	@Test
	public void getScore_returnsThirtyLoveAfterP1ScoresTwice() throws Exception {
		TennisGame game = new TennisGame("P1", "P2");
		game.player1Scores();
		game.player1Scores();
		assertThat(game.getScore(), is(equalTo("Thirty Love")));
	}

	@Test
	public void getScore_returnsLoveThirtyAfterP2ScoresTwice() throws Exception {
		TennisGame game = new TennisGame("P1", "P2");
		game.player2Scores();
		game.player2Scores();
		assertThat(game.getScore(), is(equalTo("Love Thirty")));
	}

	@Test
	public void getScore_returnsFourtyFifteenAfterP1ScoresThreeTimesAndP2ScoresOnce()
			throws Exception {
		TennisGame game = new TennisGame("P1", "P2");
		game.player1Scores();
		game.player1Scores();
		game.player1Scores();
		game.player2Scores();
		assertThat(game.getScore(), is(equalTo("Fourty Fifteen")));
	}

	@Test
	public void getScore_returnsDeuceAfterBothScoreThreeTimes()
			throws Exception {
		TennisGame game = new TennisGame("P1", "P2");
		game.player1Scores();
		game.player2Scores();
		game.player2Scores();
		game.player1Scores();
		game.player1Scores();
		game.player2Scores();
		assertThat(game.getScore(), is(equalTo("Deuce")));
	}

	@Test
	public void getScore_returnsAdvantageP1AfterP1ScoresInDeuce()
			throws Exception {
		TennisGame game = new TennisGame("P1", "P2");
		game.player1Scores();
		game.player2Scores();
		game.player2Scores();
		game.player1Scores();
		game.player1Scores();
		game.player2Scores();
		game.player1Scores();
		assertThat(game.getScore(), is(equalTo("Advantage P1")));
	}
}
