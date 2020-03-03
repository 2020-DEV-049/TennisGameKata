package com.client.exercise.tennis;

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
}
