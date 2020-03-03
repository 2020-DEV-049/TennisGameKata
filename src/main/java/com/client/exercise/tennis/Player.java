package com.client.exercise.tennis;

import com.client.exercise.tennis.constants.PointsToScoreMapper;

public class Player implements Comparable<Player> {

	private String name;

	private int points;

	public Player(String name) {
		this.name = name;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public String getScore() {
		return PointsToScoreMapper.getScore(points);
	}

	@Override
	public int compareTo(Player p) {
		return this.points - p.points;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
