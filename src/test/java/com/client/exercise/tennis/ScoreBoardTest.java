package com.client.exercise.tennis;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class ScoreBoardTest {

	private static final String FIFTEEN_LOVE = "Fifteen Love";

	private static final String LOVE_ALL = "Love All";

	Player firstPlayer;
	Player secondPlayer;
	ScoreBoard scoreBoard;

	@Before
	public void setUp() {

		firstPlayer = new Player();
		secondPlayer = new Player();

		scoreBoard = new ScoreBoard(firstPlayer, secondPlayer);
	}

	@Test
	public void scoreBoardResultShouldBeLoveAllIfBothPlayersPointsAreZero() {

		assertThat(scoreBoard.getResult(), is(LOVE_ALL));
	}

	@Test
	public void scoreBoardResultShouldBeFifteenLoveIfFirstPlayerPointsIsOne() {

		firstPlayer.setPoints(1);

		assertThat(scoreBoard.getResult(), is(FIFTEEN_LOVE));
	}

	@Test
	public void scoreBoardResultShouldBeThirtyFortyIfFirstPlayerPointsIsTwoSecondPlayerPointsIsThree() {

		firstPlayer.setPoints(2);

		secondPlayer.setPoints(3);

		assertThat(scoreBoard.getResult(), is("Thirty Forty"));
	}

}
