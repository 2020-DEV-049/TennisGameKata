package com.client.exercise.tennis;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TennisGameTest {

	private static final String LOVE_ALL = "Love All";

	private static final String ZERO_ZERO = "0 - 0";

	Player firstPlayer;
	Player secondPlayer;
	TennisGame game;

	@Before
	public void setUp() {
		firstPlayer = new Player();
		secondPlayer = new Player();

		game = new TennisGame(firstPlayer, secondPlayer);
	}

	@Test
	public void gamePointsShouldBeZeroZeroWhenGameBegins() {

		assertThat(game.getPoints(), is(ZERO_ZERO));
	}

	@Test
	public void scoreBoardShouldDisplayLoveAllWhenGamePointsIsZeroZero() {

		assertThat(game.getBoard().getResult(), is(LOVE_ALL));
	}
}
