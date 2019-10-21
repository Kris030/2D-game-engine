package com.bacskai.game_engine2D.exceptions;

/**
 * @author Bácskai Kristóf
 *
 */
public class UninstantiatableException extends Exception {
	
	private static final long serialVersionUID = -7065292756180190234L;
	
	public UninstantiatableException() {
	}
	
	/**
	 * @param message
	 */
	public UninstantiatableException(String message) {
		super(message);
	}
	
	/**
	 * @param cause
	 */
	public UninstantiatableException(Throwable cause) {
		super(cause);
	}
	
	/**
	 * @param message
	 * @param cause
	 */
	public UninstantiatableException(String message, Throwable cause) {
		super(message, cause);
	}
	
	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public UninstantiatableException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	
}
