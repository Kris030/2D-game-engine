package com.bacskai.game_engine2D.exceptions;

/**
 * @author B�cskai Krist�f
 *
 */
public class GeometryException extends Exception {
	
	private static final long serialVersionUID = 6890731278944522711L;
	
	public GeometryException() {}
	
	/**
	 * @param message
	 */
	public GeometryException(String message) {
		super(message);
	}
	
	/**
	 * @param cause
	 */
	public GeometryException(Throwable cause) {
		super(cause);
	}
	
	/**
	 * @param message
	 * @param cause
	 */
	public GeometryException(String message, Throwable cause) {
		super(message, cause);
	}
	
	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public GeometryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	
}
