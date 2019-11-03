package com.bacskai.game_engine2D.graphics.gui.Events;

import com.bacskai.game_engine2D.graphics.gui.Component;

public class SelectEvent extends Event {
	
	public Object previus;
	
	public SelectEvent(Component source, Object previus) {
		super(source);
		this.previus = previus;
	}
	
	public final Object getPrevius() {
		return previus;
	}
	
}
