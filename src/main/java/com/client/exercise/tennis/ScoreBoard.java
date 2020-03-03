package com.client.exercise.tennis;

public class ScoreBoard {

	private Player firstPlayer;
	private Player secondPlayer;

	public ScoreBoard(Player firstPlayer, Player secondPlayer) {
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
	}

	public String getResult() {
		if (firstPlayer.getPoints() == 0 && secondPlayer.getPoints() == 0) {
			return "Love All";
		} else {
			return "";
		}
	}
}
