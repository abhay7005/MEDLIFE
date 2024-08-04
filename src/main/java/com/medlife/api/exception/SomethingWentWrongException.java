package com.medlife.api.exception;

/**
 * @author Abhay
 *
 */
public class SomethingWentWrongException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public SomethingWentWrongException(String message) {
		super(message);
	}

}
