package com.client.exercise.tennis;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ScoreBoardTest {

	@Test
	public void scoreBoardResultShouldBeLoveAllIfBothPlayersPointsAreZero() {

		Player firstPlayer = new Player();
		Player secondPlayer = new Player();

		ScoreBoard scoreBoard = new ScoreBoard(firstPlayer, secondPlayer);

		assertThat(scoreBoard.getResult(), is("Love All"));
	}

}
