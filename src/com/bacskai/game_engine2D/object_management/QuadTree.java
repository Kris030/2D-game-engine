package com.bacskai.game_engine2D.object_management;

import java.util.LinkedList;

/**
 * 
 * @author B�cskai Krist�f
 */
public class QuadTree extends CollisionManager {
	
	public QuadTree() {
		
		
		
	}
	
	public boolean collide(CollideableObject o1, CollideableObject o2) {
		return false;
	}
	
	public void checkCollisions(LinkedList<CollideableObject> objects) {
	}
	
}
