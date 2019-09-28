/**
 * 
 */
package com.bacskai.game_engine2D.graphics.gui;

import com.bacskai.game_engine2D.graphics.Renderable;
import com.bacskai.game_engine2D.object_management.GameObject;

/**
 * @author hentesopossszum
 *
 */
public abstract class Component extends GameObject implements Renderable {
	
	Component parent;
	
}
