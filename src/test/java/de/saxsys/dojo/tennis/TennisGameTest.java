package de.saxsys.dojo.tennis;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Test;


public class TennisGameTest {

	@Test
	public void scoreIsLoveAllAfterGameStart() throws Exception {
		
		TennisGame tennisGame = new TennisGame();
		assertThat(tennisGame.score(), CoreMatchers.is("Love All"));
	}
}
