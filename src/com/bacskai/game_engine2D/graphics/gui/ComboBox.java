/**
 * 
 */
package com.bacskai.game_engine2D.graphics.gui;

import java.util.ArrayList;

import com.bacskai.game_engine2D.MultiStated;
import com.bacskai.game_engine2D.graphics.Renderer;

/**
 * @author hentesopossszum
 *
 */
public class ComboBox<T> extends Component implements MultiStated<T> {
	
	ArrayList<T> items;
	T selected;
	
	public void render(Renderer renderer) {
	}
	
	public T getState() {
		return selected;
	}
	
	public void setState(T t) {
		if (items.contains(t))
			selected = t;
		else
			throw new StateException("Unknown item");
	}
	
}
