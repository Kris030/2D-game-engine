package com.bacskai.game_engine2D.graphics.gui;

import java.util.ArrayList;

import com.bacskai.game_engine2D.util.MultiStated;

public class RadioButtonGroup implements MultiStated<RadioButton> {
	
	ArrayList<RadioButton> buttons;
	
	RadioButton selected;
	
	public RadioButton getState() {
		return selected;
	}
	
	public void setState(RadioButton o) {
		selected = o;
	}
	
}
