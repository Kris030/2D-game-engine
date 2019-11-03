package com.bacskai.game_engine2D.graphics;

/**
 * 
 * @author Bácskai Kristóf
 */
public class Font {
	
	public static final Font DEFAULT = new Font("Roboto", Style.PLAIN, 18);
	
	final String name;
	final Style style;
	final int size;
	
	/**
	 * @author Bácskai Kristóf
	 *
	 */
	public static enum Style {
		
		PLAIN, BOLD, ITALIC, BOLD_AND_ITALIC;
		
	}
	
	/**
	 * 
	 */
	public Font() {
		name = DEFAULT.name;
		style = DEFAULT.style;
		size = DEFAULT.size;
	}
	
	/**
	 * @param name
	 * @param style
	 * @param size
	 */
	public Font(String name, int size) {
		this.name = name;
		this.size = size;
		style = Style.PLAIN;
	}
	
	/**
	 * @param name
	 * @param style
	 * @param size
	 */
	public Font(String name, Style style, int size) {
		this.name = name;
		this.style = style;
		this.size = size;
	}
	
	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}
	
	/**
	 * @return the style
	 */
	public final Style getStyle() {
		return style;
	}
	
	/**
	 * @return the size
	 */
	public final int getSize() {
		return size;
	}
	
	public static final Font getDefault() {
		return DEFAULT;
	}
	
}
