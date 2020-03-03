package com.client.exercise.tennis;

import com.client.exercise.tennis.exceptions.InvalidPointsException;

public class TennisGame {

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
		if ((firstPlayer.getPoints() > 4 || secondPlayer.getPoints() > 4)
				&& Math.abs(firstPlayer.compareTo(secondPlayer)) > 2) {
			throw new InvalidPointsException("Player points are invalid.");
		} else {
			return new ScoreBoard(firstPlayer, secondPlayer);
		}
	}
}
