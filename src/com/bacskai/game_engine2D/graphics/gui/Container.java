/**
 * 
 */
package com.bacskai.game_engine2D.graphics.gui;

import java.util.ArrayList;

import com.bacskai.game_engine2D.graphics.Renderer;

/**
 * @author hentesopossszum
 *
 */
public abstract class Container extends Component {
	
	ArrayList<Component> components;
	
	public void render(Renderer renderer) {
		for (Component component : components)
			component.render(renderer);
	}
	
}
