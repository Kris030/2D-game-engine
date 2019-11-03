package com.bacskai.game_engine2D.graphics.gui.Listeners;

import com.bacskai.game_engine2D.graphics.gui.Events.GUIEvent;

/**
 * 
 * @author Bácskai Kristóf
 */
public interface Listener <E extends GUIEvent> {
	
	public void handleEvent(E e);
	
}
