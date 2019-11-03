package com.bacskai.game_engine2D.graphics.gui;

import com.bacskai.game_engine2D.graphics.gui.Events.Event;

/**
 * 
 * @author Bácskai Kristóf
 */
public interface Listener <E extends Event> {
	
	public void handleEvent(E e);
	
}
