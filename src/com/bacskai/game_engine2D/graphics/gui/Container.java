package com.bacskai.game_engine2D.graphics.gui;

import java.util.ArrayList;
import java.util.Collection;

import com.bacskai.game_engine2D.graphics.Renderer;

/**
 * 
 * @author hentesopossszum
 */
public abstract class Container extends Component {
	
	ArrayList<Component> components;
	
	public void paintComponent(Renderer renderer) {
		for (Component component : components)
			component.render(renderer);
	}
	
	public final Component add(Component c) {
		c.parent = this;
		components.add(c);
		return c;
	}
	
	public final void remove(Component c) {
		c.parent = null;
		components.remove(c);
	}
	
	public final void addAll(Component[] components) {
		for (Component component : components)
			add(component);
	}
	
	public final void addAll(Collection<Component> components) {
		for (Component component : components)
			add(component);
	}
	
	public final void removeAll(Component[] components) {
		for (Component component : components)
			remove(component);
	}
	
	public final void removeAll(Collection<Component> components) {
		for (Component component : components)
			remove(component);
	}
	
	public final ArrayList<Component> getComponents() {
		return components;
	}
	
}
