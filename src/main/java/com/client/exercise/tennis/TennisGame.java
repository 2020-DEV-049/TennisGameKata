package com.client.exercise.tennis;

import com.client.exercise.tennis.exceptions.InvalidPointsException;

public class TennisGame {

	private static final String PLAYER_POINTS_ARE_INVALID = "Player points are invalid.";
	private static final int MINIMUM_POINTS_DIFFERENCE_FOR_WIN = 2;
	private static final int MINIMUM_POINTS_FOR_WIN = 4;
	private Player firstPlayer;
	private Player secondPlayer;

	public TennisGame(Player firstPlayer, Player secondPlayer) {
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
	}

	public String getPoints() {
		return firstPlayer.getPoints() + " - " + secondPlayer.getPoints();
	}

	public ScoreBoard getBoard() throws InvalidPointsException {
		if (isInvalid()) {
			throw new InvalidPointsException(PLAYER_POINTS_ARE_INVALID);
		} else {
			return new ScoreBoard(firstPlayer, secondPlayer);
		}
	}

	private boolean isInvalid() {
		return (firstPlayer.getPoints() > MINIMUM_POINTS_FOR_WIN || secondPlayer
				.getPoints() > MINIMUM_POINTS_FOR_WIN)
				&& Math.abs(firstPlayer.compareTo(secondPlayer)) > MINIMUM_POINTS_DIFFERENCE_FOR_WIN;
	}
}
