package com.bacskai.game_engine2D.graphics.gui.Events;

import com.bacskai.game_engine2D.geometry.Point;
import com.bacskai.game_engine2D.graphics.gui.Component;

/**
 * @author Bácskai Kristóf
 */
public class MouseEvent extends GUIEvent {
	
	public static final int B_LEFT = 0, WHEEL = 1, B_RIGHT = 2;
	
	public final Point p;
	
	public final int button;
	
	/**
	 * @param source
	 * @param when
	 * @param p
	 */
	public MouseEvent(Component source, long when, Point p, int button) {
		super(source, when);
		this.p = p;
		this.button = button;
	}
	
}
