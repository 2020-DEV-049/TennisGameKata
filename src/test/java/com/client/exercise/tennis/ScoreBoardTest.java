package com.client.exercise.tennis;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ScoreBoardTest {

	private static final String ADVANTAGE = "Advantage ";

	private static final String DEUCE = "Deuce";

	private static final String FIFTEEN_ALL = "Fifteen All";

	private static final String THIRTY_FORTY = "Thirty Forty";

	private static final String FIFTEEN_LOVE = "Fifteen Love";

	private static final String LOVE_ALL = "Love All";

	Player firstPlayer;
	Player secondPlayer;
	ScoreBoard scoreBoard;

	@Before
	public void setUp() {

		firstPlayer = new Player("Sampras");
		secondPlayer = new Player("Agassi");

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

		assertThat(scoreBoard.getResult(), is(DEUCE));
	}

	@Test
	public void scoreBoardResultShouldBeAdvantageSecondPlayerIfFirstPlayerPointsIsThreeSecondPlayerPointsIsFour() {

		firstPlayer.setPoints(3);

		secondPlayer.setPoints(4);

		assertThat(scoreBoard.getResult(),
				is(ADVANTAGE + secondPlayer.getName()));
	}

	@Test
	public void scoreBoardResultShouldBeFirstPlayerWinsIfFirstPlayerPointsIsTenSecondPlayerPointsIsEight() {

		firstPlayer.setPoints(10);

		secondPlayer.setPoints(8);

		assertThat(scoreBoard.getResult(), is(firstPlayer.getName() + " Wins"));
	}

	@Test
	public void scoreBoardShouldDisplayAllDetailsForTheTennisGame() {
		firstPlayer.setPoints(7);

		secondPlayer.setPoints(7);

		try {
			assertThat(scoreBoard.toString(), is(generateScoreBoardDetails()));
		} catch (IOException e) {
			e.getMessage();
		}
	}

	private String generateScoreBoardDetails() throws IOException {
		Path path = Paths.get("src/test/resources/scoreBoardTest.txt");

		List<String> lines = Files.readAllLines(path);
		String output = "";

		for (String l : lines) {
			output += l;
			output += "\n";
		}

		return output;
	}

}
