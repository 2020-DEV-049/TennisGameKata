package com.client.exercise.tennis;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class ScoreBoardTest {

	private static final String FIFTEEN_ALL = "Fifteen All";

	private static final String THIRTY_FORTY = "Thirty Forty";

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

		assertThat(scoreBoard.getResult(), is(THIRTY_FORTY));
	}

	@Test
	public void scoreBoardResultShouldBeFifteenAllIfBothPlayersPointsAreOne() {

		firstPlayer.setPoints(1);

		secondPlayer.setPoints(1);

		assertThat(scoreBoard.getResult(), is(FIFTEEN_ALL));
	}

	@Test
	public void scoreBoardResultShouldBeDeuceIfBothPlayersPointsAreSix() {

		firstPlayer.setPoints(6);

		secondPlayer.setPoints(6);

		assertThat(scoreBoard.getResult(), is("Deuce"));
	}

}
