/**
 * 
 */
package com.bacskai.game_engine2D.graphics.gui;

import java.util.ArrayList;

import com.bacskai.game_engine2D.exceptions.StateException;
import com.bacskai.game_engine2D.graphics.Renderer;
import com.bacskai.game_engine2D.util.MultiStated;

/**
 * @author hentesopossszum
 *
 */
public class ComboBox<T> extends Component implements MultiStated<T> {
	
	ArrayList<T> items;
	T selected;
	
	public void paintComponent(Renderer renderer) {
		super.paintComponent(renderer);
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
