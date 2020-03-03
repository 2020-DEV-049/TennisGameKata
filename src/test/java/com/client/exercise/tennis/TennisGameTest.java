package com.client.exercise.tennis;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.client.exercise.tennis.exceptions.InvalidPointsException;

public class TennisGameTest {

	private static final String LOVE_ALL = "Love All";

	private static final String ZERO_ZERO = "0 - 0";

	Player firstPlayer;
	Player secondPlayer;
	TennisGame game;

	@Before
	public void setUp() {
		firstPlayer = new Player("Sampras");
		secondPlayer = new Player("Agassi");

		game = new TennisGame(firstPlayer, secondPlayer);
	}

	@Test
	public void gamePointsShouldBeZeroZeroWhenGameBegins() {

		assertThat(game.getPoints(), is(ZERO_ZERO));
	}

	@Test
	public void scoreBoardShouldDisplayLoveAllWhenGamePointsIsZeroZero()
			throws InvalidPointsException {

		assertThat(game.getBoard().getResult(), is(LOVE_ALL));
	}

	@Test(expected = InvalidPointsException.class)
	public void getBoardShouldThrowInvalidPointsExceptionWhenGamePointsIsTenThirteen()
			throws InvalidPointsException {
		firstPlayer.setPoints(10);
		secondPlayer.setPoints(13);

		game.getBoard();
	}
}
