package com.client.exercise.tennis;

import java.util.logging.Logger;

import com.client.exercise.tennis.exceptions.InvalidPointsException;

public class TennisGameRunner {

	private static final String REGEX = ":";
	private static final int VALID_ARGS_LENGTH = 2;
	private static final String INVALID_ARGUMENTS_MESSAGE = "Please enter 2 command line arguments in the format given below: \n [firstPlayerName]:[firstPlayerPoints]  [secondPlayerName]:[secondPlayerPoints]";
	private static final Logger logger = Logger
			.getLogger(TennisGameRunner.class.getName());

	public static void main(String args[]) {

		try {
			if (args.length != VALID_ARGS_LENGTH) {
				throw new IllegalArgumentException(INVALID_ARGUMENTS_MESSAGE);
			} else {
				String[] firstPlayerDetails = args[0].split(REGEX);
				String firstPlayerName = firstPlayerDetails[0];
				int firstPlayerPoints = Integer.parseInt(firstPlayerDetails[1]);

				String[] secondPlayerDetails = args[1].split(REGEX);
				String secondPlayerName = secondPlayerDetails[0];
				int secondPlayerPoints = Integer
						.parseInt(secondPlayerDetails[1]);

				Player firstPlayer = new Player(firstPlayerName);
				Player secondPlayer = new Player(secondPlayerName);

				TennisGame game = new TennisGame(firstPlayer, secondPlayer);

				firstPlayer.setPoints(firstPlayerPoints);
				secondPlayer.setPoints(secondPlayerPoints);

				ScoreBoard scoreBoard = game.getBoard();

				logger.info(scoreBoard.toString());
			}
		} catch (InvalidPointsException e) {
			logger.info(e.toString());
		} catch (IllegalArgumentException ex) {
			logger.info(ex.getMessage());
		}
	}

}
