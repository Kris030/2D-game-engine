package com.bacskai.game_engine2D.geometry;

/**
 * @author Bácskai Kristóf
 *
 */
public class Rectangle implements Shape {
	
	public double width, height;

	/**
	 * 
	 */
	public Rectangle() {}
	
	/**
	 * @param width
	 * @param height
	 */
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(Rectangle r) {
		this(r.width, r.height);
	}
	
	public Rectangle getBounds() {
		return this;
	}
	
	// TODO
	public boolean contains(double x, double y, Point point) {
		return false;
	}
	
	// TODO
	public boolean intersects(double x, double y, Shape shape, double x2, double y2) {
		return false;
	}
	
	/**
	 * @return the width
	 */
	public final double getWidth() {
		return width;
	}
	
	/**
	 * @param width the width to set
	 */
	public final void setWidth(double width) {
		this.width = width;
	}
	
	/**
	 * @return the height
	 */
	public final double getHeight() {
		return height;
	}
	
	/**
	 * @param height the height to set
	 */
	public final void setHeight(double height) {
		this.height = height;
	}
	
}
