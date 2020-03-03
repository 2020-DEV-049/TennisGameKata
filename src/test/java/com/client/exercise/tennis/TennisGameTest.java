package com.client.exercise.tennis;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TennisGameTest {

	@Test
	public void gamePointsShouldBeZeroZeroWhenGameBegins() {

		TennisGame game = new TennisGame();

		assertThat(game.getPoints(), is("0 - 0"));
	}
}
