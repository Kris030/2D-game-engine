package com.bacskai.game_engine2D.object_management;

import java.util.LinkedList;

import com.bacskai.game_engine2D.graphics.Renderable;
import com.bacskai.game_engine2D.graphics.Renderer;

/**
 * @author Bácskai Kristóf
 *
 */
public class Handler {
	
	LinkedList<GameObject> objects;
	LinkedList<Renderable> renderables;
	CollisionManager collisionManager;
	
	public Handler() {}
	
	public final void tickAll() {
		for (GameObject gameObject : objects)
			gameObject.tick();
	}
	
	public final void renderAll(Renderer renderer) {
		for (Renderable renderable : renderables)
			renderable.render(renderer);
	}
	
}
