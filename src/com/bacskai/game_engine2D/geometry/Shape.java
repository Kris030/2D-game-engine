package com.bacskai.game_engine2D.geometry;

/**
 * @author Bácskai Kristóf
 *
 */
public interface Shape {
	
	public Rectangle getBounds();
	
	public boolean contains(double x, double y, Point point);
	
	public default boolean contains(Point position, Point point) {
		return contains(position.x, position.y, point);
	}
	
	public boolean intersects(double x, double y, Shape shape, double x2, double y2);
	
	public default boolean intersects(Point position, Shape shape, Point shapePosition) {
		return intersects(position.x, position.y, shape, shapePosition.x, shapePosition.y);
	}
	
	public default Point[] getPoints() {
		return null;
	}
	
}
