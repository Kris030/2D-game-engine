package com.bacskai.game_engine2D.object_management;

import com.bacskai.game_engine2D.geometry.Point;

/**
 * @author Bácskai Kristóf
 *
 */
public class GameObject extends Point {
	
	/** */
	private double velX;
	/** */
	private double velY;
	
	/** */
	private double xLockDistance;
	/** */
	private double yLockDistance;
	
	/** */
	private boolean xLocked;
	/** */
	private boolean yLocked;
	
	/** */
	private GameObject xLockedTo;
	/** */
	private GameObject yLockedTo;
	
	public GameObject() {}
	
	/**
	 * @param position
	 */
	public GameObject(Point position) {
		this(position.x, position.y);
	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 */
	public GameObject(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * 
	 * @param time
	 */
	public void tick(long time) {
		updatePosition(time);
	}
	
	/**
	 * 
	 * @param time
	 */
	private void updatePosition(long time) {
		
		if (!xLocked)
			x += + velX * time;
		else if (xLockedTo != null)
			x = xLockedTo.getX() + xLockDistance;
		
		if (!yLocked)
			y += + velY * time;
		else if (yLockedTo != null)
			y = yLockedTo.getY() + yLockDistance;
		
	}
	
	/**
	 * if object is null than the object's x will be locked to the current position, ignoring currentPos
	 * 
	 * @param object
	 * @param currentPos
	 */
	public final void lockX(GameObject object, boolean currentPos) {
		
		xLocked = true;
		xLockedTo = object;
		
		if (object != null && currentPos)
			xLockDistance = getX() - object.getX();
		
	}
	
	/**
	 * if object is null than the object's y will be locked to the current position, ignoring currentPos
	 * 
	 * @param object
	 * @param currentPos
	 */
	public final void lockY(GameObject object, boolean currentPos) {
		
		yLocked = true;
		yLockedTo = object;
		
		if (object != null && currentPos)
			yLockDistance = getY() - object.getY();
		
	}
	
	/**
	 * 
	 * lock's both x and y
	 * 
	 * @param object
	 * @param currentPos
	 */
	public final void lockPosition(GameObject object, boolean currentPos) {
		lockX(object, currentPos);
		lockY(object, currentPos);
	}
	
	public final void setXLockDistance(double xLockDistance) {
		if (xLocked)
			this.xLockDistance = xLockDistance;
	}
	
	public final void setYLockDistance(double yLockDistance) {
		if (yLocked)
			this.yLockDistance = yLockDistance;
	}
	
	public final void unlockX() {
		xLocked = false;
		xLockedTo = null;
		xLockDistance = 0;
	}
	
	public final void unlockY() {
		yLocked = false;
		yLockedTo = null;
		yLockDistance = 0;
	}
	
	public final void unlockPosition() {
		unlockX();
		unlockY();
	}
	
	/**
	 * @param x the x to set
	 */
	public final void setX(double x) {
		if (!xLocked)
			this.x = x;
	}
	
	/**
	 * @param y the y to set
	 */
	public final void setY(double y) {
		if (!yLocked)
			this.y = y;
	}
	
	public final double getVelX() {
		return velX;
	}
	
	public final void setVelX(double velX) {
		this.velX = velX;
	}
	
	public final double getVelY() {
		return velY;
	}
	
	public final void setVelY(double velY) {
		this.velY = velY;
	}
	
	/**
	 * @param position the position to set
	 */
	public final void setPosition(Point position) {
		if (!xLocked && !yLocked) {
			x = position.x;
			y = position.y;
		}
	}
	
}
