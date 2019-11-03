package com.bacskai.game_engine2D.graphics.gui;

import java.util.LinkedList;

import javax.swing.JFrame;

import com.bacskai.game_engine2D.exceptions.GeometryException;
import com.bacskai.game_engine2D.geometry.Point;
import com.bacskai.game_engine2D.geometry.Shape;
import com.bacskai.game_engine2D.graphics.Renderable;
import com.bacskai.game_engine2D.graphics.Renderer;
import com.bacskai.game_engine2D.graphics.Theme;
import com.bacskai.game_engine2D.object_management.CollideableObject;

/**
 * 
 * @author hentesopossszum
 */
public class Window extends CollideableObject implements Renderable {
	
	private static final class RootComponent extends Container {
		
		Window w;
		
		public void paintComponent(Renderer renderer) {
			w.paintComponent();
		}
		
		public boolean contains(Point p) {
			return true;
		}
		
		public boolean collides(Shape s) {
			return false;
		}

		public LinkedList<Point> getPoints() throws GeometryException {
			
			LinkedList<Point> l = new LinkedList<Point>();
			
			
			
			return l;
		}
		
	}
	
	JFrame frame;
	
	RootComponent root;
	
	Renderer renderer;
	
	Theme theme;
	
	public Window() {
		root = new RootComponent();
		root.w = this;
		theme = Theme.DEFAULT;
	}
	
	public void paintComponent() {}
	
	public final void render(Renderer renderer) {
		root.render(this.renderer);
	}
	
}
