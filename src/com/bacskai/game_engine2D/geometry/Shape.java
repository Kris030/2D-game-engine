package com.bacskai.game_engine2D.geometry;

import java.util.LinkedList;

import com.bacskai.game_engine2D.exceptions.GeometryException;

/**
 * @author Bácskai Kristóf
 *
 */
public interface Shape {
	
	public double getX();
	
	public double getY();
	
	public boolean contains(Point p);
	
	public boolean collides(Shape s);
	
	public LinkedList<Point> getPoints() throws GeometryException;
	
}
