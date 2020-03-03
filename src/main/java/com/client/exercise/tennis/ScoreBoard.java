package com.client.exercise.tennis;

public class ScoreBoard {

	private static final String LOVE_ALL = "Love All";
	private Player firstPlayer;
	private Player secondPlayer;

	public ScoreBoard(Player firstPlayer, Player secondPlayer) {
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
	}

	public String getResult() {

		String result;

		if (firstPlayer.getPoints() > 0 || secondPlayer.getPoints() > 0) {

			result = firstPlayer.getScore() + " " + secondPlayer.getScore();
		} else {

			result = LOVE_ALL;
		}

		return result;
	}
}
