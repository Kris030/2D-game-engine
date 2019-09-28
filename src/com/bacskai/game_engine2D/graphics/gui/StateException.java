package com.bacskai.game_engine2D.graphics.gui;

/**
 * @author Bácskai Kristóf
 *
 */
public class StateException extends RuntimeException {
	
	private static final long serialVersionUID = 880859470775004560L;
	
	public StateException() {
	}
	
	/**
	 * @param message
	 */
	public StateException(String message) {
		super(message);
	}
	
	/**
	 * @param cause
	 */
	public StateException(Throwable cause) {
		super(cause);
	}
	
	/**
	 * @param message
	 * @param cause
	 */
	public StateException(String message, Throwable cause) {
		super(message, cause);
	}
	
	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public StateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	
}
