package de.saxsys.dojo.tennis;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TennisGameTest {

	@Test
	public void getScore_returnsLoveAllAfterGameStarts() throws Exception {
		assertThat(new TennisGame().getScore(), is(equalTo("Love all")));
	}

	@Test
	public void getScore_returnsFifteenLoveAfterP1Scores() throws Exception {
		TennisGame game = new TennisGame();
		game.player1Scores();
		assertThat(game.getScore(), is(equalTo("Fifteen Love")));
	}

	@Test
	public void getScore_returnsFifteenAllAfterBothScoreOnce() throws Exception {
		TennisGame game = new TennisGame();
		game.player1Scores();
		game.player2Scores();
		assertThat(game.getScore(), is(equalTo("Fifteen all")));
	}
}
