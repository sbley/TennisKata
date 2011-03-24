package de.saxsys.dojo.tennis;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TennisGameTest {

	@Test
	public void getScore_returnsLoveAllAfterGameStarts() throws Exception {
		assertThat(gameBetweenP1AndP2().getScore(), is(equalTo("Love all")));
	}

	@Test
	public void getScore_returnsFifteenLoveAfterP1Scores() throws Exception {
		TennisGame game = gameBetweenP1AndP2();
		game.player1Scores();
		assertThat(game.getScore(), is(equalTo("Fifteen Love")));
	}

	@Test
	public void getScore_returnsFifteenAllAfterBothScoreOnce() throws Exception {
		TennisGame game = gameBetweenP1AndP2();
		game.player1Scores();
		game.player2Scores();
		assertThat(game.getScore(), is(equalTo("Fifteen all")));
	}

	@Test
	public void getScore_returnsThirtyLoveAfterP1ScoresTwice() throws Exception {
		TennisGame game = gameBetweenP1AndP2();
		game.player1Scores();
		game.player1Scores();
		assertThat(game.getScore(), is(equalTo("Thirty Love")));
	}

	@Test
	public void getScore_returnsLoveThirtyAfterP2ScoresTwice() throws Exception {
		TennisGame game = gameBetweenP1AndP2();
		game.player2Scores();
		game.player2Scores();
		assertThat(game.getScore(), is(equalTo("Love Thirty")));
	}

	@Test
	public void getScore_returnsFourtyFifteenAfterP1ScoresThreeTimesAndP2ScoresOnce()
			throws Exception {
		TennisGame game = gameBetweenP1AndP2();
		game.player1Scores();
		game.player1Scores();
		game.player1Scores();
		game.player2Scores();
		assertThat(game.getScore(), is(equalTo("Fourty Fifteen")));
	}

	@Test
	public void getScore_returnsDeuceAfterBothScoreThreeTimes()
			throws Exception {
		TennisGame game = gameBetweenP1AndP2();
		playUntilDeuce(game);
		assertThat(game.getScore(), is(equalTo("Deuce")));
	}

	@Test
	public void getScore_returnsAdvantageP1AfterP1ScoresInDeuce()
			throws Exception {
		TennisGame game = gameBetweenP1AndP2();
		playUntilDeuce(game);
		game.player1Scores();
		assertThat(game.getScore(), is(equalTo("Advantage P1")));
	}

	@Test
	public void getScore_returnsAdvantageP2AfterP2ScoresInDeuce()
			throws Exception {
		TennisGame game = gameBetweenP1AndP2();
		playUntilDeuce(game);
		game.player2Scores();
		assertThat(game.getScore(), is(equalTo("Advantage P2")));
	}

	@Test
	public void getScore_returnsP1WinsAfterP1ScoresFourTimes() throws Exception {
		TennisGame game = gameBetweenP1AndP2();
		game.player1Scores();
		game.player1Scores();
		game.player1Scores();
		game.player1Scores();
		assertThat(game.getScore(), is(equalTo("P1 wins")));
	}

	@Test
	public void getScore_returnsP2WinsAfterP1ScoresTwiceAndP2ScoresFourTimes()
			throws Exception {
		TennisGame game = gameBetweenP1AndP2();
		game.player1Scores();
		game.player1Scores();
		game.player2Scores();
		game.player2Scores();
		game.player2Scores();
		game.player2Scores();
		assertThat(game.getScore(), is(equalTo("P2 wins")));
	}

	@Test
	public void getScore_returnsP1WinsAfterP1ScoresInOwnAdvantage()
			throws Exception {
		TennisGame game = gameBetweenP1AndP2();
		playUntilDeuce(game);
		game.player1Scores();
		game.player1Scores();
		assertThat(game.getScore(), is(equalTo("P1 wins")));
	}

	private TennisGame gameBetweenP1AndP2() {
		return new TennisGame("P1", "P2");
	}

	private void playUntilDeuce(TennisGame game) {
		game.player1Scores();
		game.player2Scores();
		game.player2Scores();
		game.player1Scores();
		game.player1Scores();
		game.player2Scores();
	}
}
