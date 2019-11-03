package com.bacskai.game_engine2D.graphics.gui.Events;

import com.bacskai.game_engine2D.exceptions.UninstantiatableException;
import com.bacskai.game_engine2D.graphics.gui.Component;

public class Event {
	
	public final Component source;
	
	private Event() throws UninstantiatableException {
		throw new UninstantiatableException("Events cannot be created without a source");
	}
	
	public Event(Component source) {
		this.source = source;
	}
	
	public final Component getSource() {
		return source;
	}
	
}
