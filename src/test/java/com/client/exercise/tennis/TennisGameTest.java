package com.client.exercise.tennis;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TennisGameTest {

	private static final String ZERO_ZERO = "0 - 0";

	@Test
	public void gamePointsShouldBeZeroZeroWhenGameBegins() {
		Player firstPlayer = new Player();
		Player secondPlayer = new Player();

		TennisGame game = new TennisGame(firstPlayer, secondPlayer);

		assertThat(game.getPoints(), is(ZERO_ZERO));
	}
	
}
