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
		if (firstPlayer.getPoints() == 1 && secondPlayer.getPoints() == 0) {
			return "Fifteen Love";
		} else if (firstPlayer.getPoints() == 0
				&& secondPlayer.getPoints() == 0) {
			return LOVE_ALL;
		} else {
			return "";
		}
	}
}
