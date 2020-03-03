package com.client.exercise.tennis;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TennisGameTest {

	@Test
	public void gamePointsShouldBeZeroZeroWhenGameBegins() {
		Player firstPlayer = new Player();
		Player secondPlayer = new Player();

		TennisGame game = new TennisGame(firstPlayer, secondPlayer);

		assertThat(game.getPoints(), is("0 - 0"));
	}
}
