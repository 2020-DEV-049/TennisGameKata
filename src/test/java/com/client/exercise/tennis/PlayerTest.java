package com.client.exercise.tennis;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {

	private static final String FORTY = "Forty";
	private static final String THIRTY = "Thirty";
	private static final String FIFTEEN = "Fifteen";
	private static final String LOVE = "Love";
	Player player;

	@Before
	public void setUp() {

		player = new Player("Sampras");
	}

	@Test
	public void getScoreShouldReturnLoveIfPlayerPointsIsZero() {

		player.setPoints(0);

		assertThat(player.getScore(), CoreMatchers.is(LOVE));
	}

	@Test
	public void getScoreShouldReturnFifteenIfPlayerPointsIsOne() {

		player.setPoints(1);

		assertThat(player.getScore(), CoreMatchers.is(FIFTEEN));
	}

	@Test
	public void getScoreShouldReturnThirtyIfPlayerPointsIsTwo() {

		player.setPoints(2);

		assertThat(player.getScore(), CoreMatchers.is(THIRTY));
	}

	@Test
	public void getScoreShouldReturnFortyIfPlayerPointsIsThree() {

		player.setPoints(3);

		assertThat(player.getScore(), CoreMatchers.is(FORTY));
	}
}
