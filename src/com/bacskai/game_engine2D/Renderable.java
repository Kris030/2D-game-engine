/**
 * 
 */
package com.bacskai.game_engine2D;

import com.bacskai.game_engine2D.graphics.Renderer;

/**
 * @author hentesopossszum
 *
 */
public interface Renderable {
	
	// A render method that renders what you want to render with the help of the Renderer that's called renderer
	public void render(Renderer renderer);
	
}
