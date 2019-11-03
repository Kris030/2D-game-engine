package com.bacskai.game_engine2D.graphics.gui.Events;

import com.bacskai.game_engine2D.graphics.gui.Component;

public class SelectEvent extends GUIEvent {
	
	public final Object previus;
	
	public SelectEvent(Component source, long when, Object previus) {
		super(source, when);
		this.previus = previus;
	}
	
	public final Object getPrevius() {
		return previus;
	}
	
}
