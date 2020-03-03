package com.client.exercise.tennis;

public class ScoreBoard {

	private static final int MINIMUM_POINTS_FOR_DEUCE = 3;
	private static final String DEUCE = "Deuce";
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
			if (firstPlayer.getPoints() >= MINIMUM_POINTS_FOR_DEUCE) {
				result = DEUCE;
			} else {
				result = firstPlayer.getScore() + ALL;
			}
		} else {

			result = firstPlayer.getScore() + " " + secondPlayer.getScore();
		}

		return result;
	}
}
