package com.client.exercise.tennis;

import com.client.exercise.tennis.constants.PointsToScoreMapper;

public class Player implements Comparable<Player> {

	private int points;

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
}
