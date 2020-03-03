package com.client.exercise.tennis;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {

	Player player;

	@Before
	public void setUp() {

		player = new Player();
	}

	@Test
	public void getScoreShouldReturnLoveIfPlayerPointsIsZero() {

		player.setPoints(0);

		assertThat(player.getScore(), CoreMatchers.is("Love"));
	}

	@Test
	public void getScoreShouldReturnFifteenIfPlayerPointsIsOne() {

		player.setPoints(1);

		assertThat(player.getScore(), CoreMatchers.is("Fifteen"));
	}

	@Test
	public void getScoreShouldReturnThirtyIfPlayerPointsIsTwo() {

		player.setPoints(2);

		assertThat(player.getScore(), CoreMatchers.is("Thirty"));
	}

	@Test
	public void getScoreShouldReturnFortyIfPlayerPointsIsThree() {

		player.setPoints(3);

		assertThat(player.getScore(), CoreMatchers.is("Forty"));
	}
}
