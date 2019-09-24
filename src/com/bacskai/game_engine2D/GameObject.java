package com.bacskai.game_engine2D;

import com.bacskai.game_engine2D.geometry.Point;

/**
 * @author Bácskai Kristóf
 *
 */
public class GameObject {
	
	private Point position;
	
	// TODO
	private boolean xLocked;
	private boolean yLocked;
	
	private GameObject xLockedTo;
	private GameObject yLockedTo;
	
	/**
	 * 
	 */
	public GameObject() {}
	
	/**
	 * @return the x
	 */
	public final double getX() {
		return position.x;
	}
	
	/**
	 * @param x the x to set
	 */
	public final void setX(double x) {
		if (!xLocked)
			this.position.x = x;
	}
	
	/**
	 * @return the y
	 */
	public final double getY() {
		return position.y;
	}
	
	/**
	 * @param y the y to set
	 */
	public final void setY(double y) {
		if (!yLocked)
			this.position.y = y;
	}
	
	/**
	 * @return the position
	 */
	public final Point getPosition() {
		return position;
	}
	
	/**
	 * @param position the position to set
	 */
	public final void setPosition(Point position) {
		this.position = position;
	}
	
}
