package com.bacskai.game_engine2D;

/**
 * 
 * @author Bácskai Kristóf
 */
public class Font {
	
	public static final Font DEFAULT = new Font("Roboto", Style.PLAIN, 18);
	
	String name;
	Style style;
	int size;
	
	/**
	 * @author Bácskai Kristóf
	 *
	 */
	public enum Style {
		
		PLAIN, BOLD, ITALIC, BOLD_AND_ITALIC;
		
	}
	
	/**
	 * 
	 */
	public Font() {}
	
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
	 * @param name the name to set
	 */
	public final void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the style
	 */
	public final Style getStyle() {
		return style;
	}
	
	/**
	 * @param style the style to set
	 */
	public final void setStyle(Style style) {
		this.style = style;
	}
	
	/**
	 * @return the size
	 */
	public final int getSize() {
		return size;
	}
	
	/**
	 * @param size the size to set
	 */
	public final void setSize(int size) {
		this.size = size;
	}
	
	public static final Font getDefault() {
		return DEFAULT;
	}
	
}
