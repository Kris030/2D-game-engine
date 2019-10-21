package com.bacskai.game_engine2D.graphics.gui;

import com.bacskai.game_engine2D.graphics.Renderable;
import com.bacskai.game_engine2D.object_management.CollideableObject;

/**
 * @author hentesopossszum
 *
 */
public abstract class Component extends CollideableObject implements Renderable {
	
	Component parent;
	
	public final void paint() {
		paintComponent();
		if (parent != null)
			parent.paint();
	}
	
	public void paintComponent() {}
	
}
