/**
 * 
 */
package com.bacskai.game_engine2D.graphics.gui;

import com.bacskai.game_engine2D.MultiStated;
import com.bacskai.game_engine2D.graphics.Renderer;

/**
 * @author hentesopossszum
 *
 */
public class RadioButton extends Component implements MultiStated<Boolean> {
	
	boolean ticked;
	
	public void render(Renderer renderer) {
	}
	
	public Boolean getState() {
		return ticked;
	}
	
	public void setState(Boolean o) {
		ticked = o;
	}
	
}
