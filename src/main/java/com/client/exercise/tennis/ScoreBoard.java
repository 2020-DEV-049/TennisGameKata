package com.client.exercise.tennis;

public class ScoreBoard {

	private static final String NEW_LINE = "\n";
	private static final String SCOREBOARD_DISPLAY_FORMAT = "|%1$-25s|%2$-25s|";
	private static final String RESULT = "Result";
	private static final String POINTS = "Points";
	private static final String PLAYER_NAMES = "Player Names";
	private static final String WINS = " Wins";
	private static final int MINIMUM_POINTS_DIFFERENCE_FOR_WIN = 2;
	private static final int MINIMUM_POINTS_FOR_WIN = 4;
	private static final String ADVANTAGE = "Advantage ";
	private static final int POINTS_DIFFERENCE_FOR_ADVANTAGE = 1;
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

		int playerPointsCompared = firstPlayer.compareTo(secondPlayer);
		int playerPointsDifference = Math.abs(playerPointsCompared);

		if (isWin(playerPointsDifference)) {

			result = getLeadingPlayerName(playerPointsCompared) + WINS;
		} else if (isAdvantage(playerPointsDifference)) {

			result = ADVANTAGE + getLeadingPlayerName(playerPointsCompared);
		} else if (playerPointsCompared == 0) {

			result = firstPlayer.getPoints() >= MINIMUM_POINTS_FOR_DEUCE ? DEUCE
					: firstPlayer.getScore() + ALL;
		} else {

			result = firstPlayer.getScore() + " " + secondPlayer.getScore();
		}

		return result;
	}

	@Override
	public String toString() {

		String[] scoreBoardContents = { PLAYER_NAMES, POINTS,
				firstPlayer.getName(), String.valueOf(firstPlayer.getPoints()),
				secondPlayer.getName(),
				String.valueOf(secondPlayer.getPoints()), RESULT, getResult() };

		String displayResult = NEW_LINE;

		for (int boardIndex = 0; boardIndex <= boardIndex + 1
				&& boardIndex <= scoreBoardContents.length - 1; boardIndex = boardIndex + 2) {
			displayResult += String.format(SCOREBOARD_DISPLAY_FORMAT,
					scoreBoardContents[boardIndex],
					scoreBoardContents[boardIndex + 1])
					+ NEW_LINE;
		}

		return displayResult;
	}

	private boolean isWin(int playerPointsDifference) {
		return (firstPlayer.getPoints() >= MINIMUM_POINTS_FOR_WIN || secondPlayer
				.getPoints() >= MINIMUM_POINTS_FOR_WIN)
				&& playerPointsDifference >= MINIMUM_POINTS_DIFFERENCE_FOR_WIN;
	}

	private boolean isAdvantage(int playerPointsDifference) {
		return firstPlayer.getPoints() >= MINIMUM_POINTS_FOR_DEUCE
				&& secondPlayer.getPoints() >= MINIMUM_POINTS_FOR_DEUCE
				&& playerPointsDifference == POINTS_DIFFERENCE_FOR_ADVANTAGE;
	}

	private String getLeadingPlayerName(int playerPointsCompared) {
		return playerPointsCompared > 0 ? firstPlayer.getName() : secondPlayer
				.getName();
	}
}
