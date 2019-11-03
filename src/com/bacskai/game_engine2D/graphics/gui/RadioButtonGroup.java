package com.bacskai.game_engine2D.graphics.gui;

import java.util.ArrayList;
import java.util.Collection;

import com.bacskai.game_engine2D.graphics.gui.Events.SelectEvent;
import com.bacskai.game_engine2D.util.MultiStated;

/**
 * 
 * Convienence class to hold a group of {@link RadioButton}s,
 * where only one can be selected at a time.
 * 
 * @author Bácskai Kristóf
 */
public class RadioButtonGroup implements MultiStated<RadioButton> {
	
	private final Listener<SelectEvent> l = (SelectEvent e) -> {
		selected = (RadioButton) e.getSource();
	};
	
	ArrayList<RadioButton> buttons;
	
	RadioButton selected;
	
	public final void add(RadioButton button) {
		buttons.add(button);
		button.addListener(l);
	}
	
	public final void remove(RadioButton button) {
		buttons.remove(button);
		button.removeListener(l);
	}
	
	public final void addAll(RadioButton[] buttons) {
		for (RadioButton b : buttons)
			add(b);
	}
	
	public final void addAll(Collection<RadioButton> buttons) {
		for (RadioButton b : buttons)
			add(b);
	}
	
	public final void removeAll(RadioButton[] buttons) {
		for (RadioButton b : buttons)
			remove(b);
	}
	
	public final void removeAll(Collection<RadioButton> buttons) {
		for (RadioButton b : buttons)
			remove(b);
	}
	
	public RadioButton getState() {
		return selected;
	}
	
	public void setState(RadioButton o) {
		selected = o;
	}
	
}
