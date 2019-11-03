package com.bacskai.game_engine2D.object_management;

import java.util.LinkedList;

/**
 * @author Bácskai Kristóf
 *
 */
public abstract class CollisionManager {
	
	public CollisionManager() {}
	
	public abstract void checkCollisions(LinkedList<CollideableObject> objects);
	
	public abstract boolean collide(CollideableObject o1, CollideableObject o2);
	
}
