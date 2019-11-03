package com.bacskai.game_engine2D.graphics.gui;

import com.bacskai.game_engine2D.graphics.gui.Events.Event;

/**
 * 
 * @author B�cskai Krist�f
 */
public interface Listener <E extends Event> {
	
	public void handleEvent(E e);
	
}
