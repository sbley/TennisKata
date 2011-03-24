package de.saxsys.dojo.tennis;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;


public class TennisGameTest {

	@Test
	public void getScore_returnsLoveAllAfterGameStarts() throws Exception {
		assertThat(new TennisGame().getScore(), is(equalTo("Love all")));
	}
}
