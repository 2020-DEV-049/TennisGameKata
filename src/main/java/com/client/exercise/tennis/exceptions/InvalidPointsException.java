package com.client.exercise.tennis.exceptions;

public class InvalidPointsException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidPointsException(String message) {

		super(message);
	}

	@Override
	public String toString() {
		return "InvalidPointsException occured: " + getMessage();
	}

}
