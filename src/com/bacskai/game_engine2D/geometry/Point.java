package com.bacskai.game_engine2D.geometry;

/**
 * @author Bácskai Kristóf
 *
 */
public class Point {
	
	public double x;
	public double y;
	
	public Point() {}
	
	/**
	 * @param x
	 * @param y
	 */
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * @return the x
	 */
	public double getX() {
		return x;
	}
	
	/**
	 * @param x the x to set
	 */
	public void setX(double x) {
		this.x = x;
	}
	
	/**
	 * @return the y
	 */
	public double getY() {
		return y;
	}
	
	/**
	 * @param y the y to set
	 */
	public void setY(double y) {
		this.y = y;
	}
	
	public final boolean equals(Object obj) {
		if (obj instanceof Point)
			return ((Point) obj).x == x && ((Point) obj).y == y;
		else
			return super.equals(obj);
	}
	
}
