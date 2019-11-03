package com.bacskai.game_engine2D.graphics;

import com.bacskai.game_engine2D.Color;
import com.bacskai.game_engine2D.Font;

/**
 * @author Bácskai Kristóf
 *
 */
public class Theme {
	
	public static final Theme DEFAULT = new Theme(Font.DEFAULT, Color.white, Color.black);
	
	Font font;
	
	Color backgroundColor;
	Color contentColor;
	
	/**
	 * 
	 */
	public Theme() {}
	
	/**
	 * @param font
	 * @param backgroundColor
	 * @param contentColor
	 */
	public Theme(Font font, Color backgroundColor, Color contentColor) {
		this.font = font;
		this.backgroundColor = backgroundColor;
		this.contentColor = contentColor;
	}
	
	/**
	 * @return the font
	 */
	public final Font getFont() {
		return font;
	}
	
	/**
	 * @param font the font to set
	 */
	public final void setFont(Font font) {
		this.font = font;
	}
	
	/**
	 * @return the backgroundColor
	 */
	public final Color getBackgroundColor() {
		return backgroundColor;
	}
	
	/**
	 * @param backgroundColor the backgroundColor to set
	 */
	public final void setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
	}
	
	/**
	 * @return the contentColor
	 */
	public final Color getContentColor() {
		return contentColor;
	}
	
	/**
	 * @param contentColor the contentColor to set
	 */
	public final void setContentColor(Color contentColor) {
		this.contentColor = contentColor;
	}
	
	/**
	 * @return the default
	 */
	public static final Theme getDefault() {
		return DEFAULT;
	}
	
}
