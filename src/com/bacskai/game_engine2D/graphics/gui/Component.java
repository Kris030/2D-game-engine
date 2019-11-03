package com.bacskai.game_engine2D.graphics.gui;

import java.util.ArrayList;
import java.util.Collection;

import com.bacskai.game_engine2D.graphics.Renderable;
import com.bacskai.game_engine2D.graphics.Renderer;
import com.bacskai.game_engine2D.graphics.Theme;
import com.bacskai.game_engine2D.object_management.CollideableObject;

/**
 * @author hentesopossszum
 *
 */
public class Component extends CollideableObject implements Renderable {
	
	Component parent;
	
	ArrayList<Listener> listeners;
	
	Theme theme;
	
	public Component() {
		theme = Theme.DEFAULT;
	}
	
	/**
	 * @param theme
	 */
	public Component(Theme theme) {
		this.theme = theme;
	}
	
	public void addListener(Listener listener) {
		listeners.add(listener);
	}
	
	public void removeListener(Listener listener) {
		listeners.remove(listener);
	}
	
	public void addListeners(Listener[] listeners) {
		for (Listener l : listeners)
			addListener(l);
	}
	
	public void addListeners(Collection<Listener> listeners) {
		for (Listener l : listeners)
			addListener(l);
	}
	
	public void removeListeners(Listener[] listeners) {
		for (Listener l : listeners)
			removeListener(l);
	}
	
	public void removeListeners(Collection<Listener> listeners) {
		for (Listener l : listeners)
			removeListener(l);
	}
	
	public void paintComponent(Renderer renderer) {}
	
	public final void render(Renderer renderer) {
		paintComponent(renderer);
		if (parent != null)
			parent.render(renderer);
	}
	
}
