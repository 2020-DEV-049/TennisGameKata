package com.client.exercise.tennis;

public class ScoreBoard {

	private static final String ALL = " All";
	private Player firstPlayer;
	private Player secondPlayer;

	public ScoreBoard(Player firstPlayer, Player secondPlayer) {
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
	}

	public String getResult() {

		String result;

		if (firstPlayer.compareTo(secondPlayer) == 0) {

			result = firstPlayer.getScore() + ALL;
		} else {

			result = firstPlayer.getScore() + " " + secondPlayer.getScore();
		}

		return result;
	}
}
