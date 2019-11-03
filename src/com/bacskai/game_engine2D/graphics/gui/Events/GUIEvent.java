package com.bacskai.game_engine2D.graphics.gui.Events;

import com.bacskai.game_engine2D.exceptions.UninstantiatableException;
import com.bacskai.game_engine2D.graphics.gui.Component;

public class GUIEvent {
	
	public final Component source;
	
	public final long when;
	
	private GUIEvent() throws UninstantiatableException {
		throw new UninstantiatableException("Events cannot be created without a source");
	}
	
	public GUIEvent(Component source, long when) {
		this.source = source;
		this.when = when;
	}
	
	public final Component getSource() {
		return source;
	}
	
	public final long getWhen() {
		return when;
	}
	
}
