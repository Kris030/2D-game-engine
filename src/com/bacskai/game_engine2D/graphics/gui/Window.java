package com.bacskai.game_engine2D.graphics.gui;

import javax.swing.JFrame;

import com.bacskai.game_engine2D.graphics.Renderer;
import com.bacskai.game_engine2D.graphics.Theme;

/**
 * 
 * @author hentesopossszum
 */
public class Window {
	
	private static final class RootComponent extends Container {
		
		Window w;
		
		public void paintComponent(Renderer renderer) {
			w.paintComponent();
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
	
	public final void render() {
		root.render(renderer);
	}
	
}
