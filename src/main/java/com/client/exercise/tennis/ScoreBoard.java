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

		if (firstPlayer.getPoints() >= MINIMUM_POINTS_FOR_DEUCE
				&& secondPlayer.getPoints() >= MINIMUM_POINTS_FOR_DEUCE
				&& Math.abs(firstPlayer.compareTo(secondPlayer)) == 1) {
			if (firstPlayer.compareTo(secondPlayer) > 0) {
				result = "Advantage " + firstPlayer.getName();
			} else {
				result = "Advantage " + secondPlayer.getName();
			}
		} else if (firstPlayer.compareTo(secondPlayer) == 0) {

			result = firstPlayer.getPoints() >= MINIMUM_POINTS_FOR_DEUCE ? DEUCE
					: firstPlayer.getScore() + ALL;
		} else {

			result = firstPlayer.getScore() + " " + secondPlayer.getScore();
		}

		return result;
	}
}
