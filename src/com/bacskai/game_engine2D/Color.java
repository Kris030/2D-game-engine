package com.bacskai.game_engine2D;

/**
 * 
 * The default color constants are the same as in {@link java.awt.Color} as of java version {@code 1.8}.
 * 
 * @author Bácskai Kristóf
 */
public class Color {
	
	/** The color white. */
	public static final Color white = new Color(255, 255, 255);
	
	/** The color white. */
	public static final Color WHITE = white;
	
	/** The color light gray. */
	public static final Color lightGray = new Color(192, 192, 192);
	
	/**The color light gray. */
	public static final Color LIGHT_GRAY = lightGray;
	
	/** The color gray. */
	public static final Color gray = new Color(128, 128, 128);
	
	/** The color gray. */
	public static final Color GRAY = gray;
	
	/** The color dark gray. */
	public static final Color darkGray = new Color(64, 64, 64);
	
	/** The color dark gray. */
	public static final Color DARK_GRAY = darkGray;
	
	/** The color black.  */
	public static final Color black = new Color(0, 0, 0);
	
	/** The color black. */
	public static final Color BLACK = black;
	
	/** The color red. */
	public static final Color red = new Color(255, 0, 0);
	
	/** The color red. */
	public static final Color RED = red;
	
	/** The color pink. */
	public static final Color pink = new Color(255, 175, 175);
	
	/** The color pink. */
	public static final Color PINK = pink;
	
	/** The color orange. */
	public static final Color orange = new Color(255, 200, 0);
	
	/** The color orange. */
	public static final Color ORANGE = orange;
	
	/** The color yellow. */
	public static final Color yellow = new Color(255, 255, 0);
	
	/** The color yellow. */
	public static final Color YELLOW = yellow;
	
	/** The color green. */
	public static final Color green = new Color(0, 255, 0);
	
	/** The color green. */
	public static final Color GREEN = green;
	
	/** The color magenta. */
	public static final Color magenta   = new Color(255, 0, 255);
	
	/** The color magenta. */
	public static final Color MAGENTA = magenta;
	
	/** The color cyan. */
	public static final Color cyan = new Color(0, 255, 255);
	
	/** The color cyan. */
	public static final Color CYAN = cyan;
	
	/** The color blue. */
	public static final Color blue = new Color(0, 0, 255);
	
	/** The color blue. */
	public static final Color BLUE = blue;
	
	private int RGBValue;
	
	public Color(java.awt.Color APIColor) {
		this(APIColor.getRed(), APIColor.getGreen(), APIColor.getBlue(), APIColor.getAlpha());
	}
	
	public Color(int red, int green, int blue) {
		this(red, green, blue, 255);
	}
	
	public Color(int red, int green, int blue, int alhpa) {
		RGBValue = ((alhpa & 0xFF) << 24) | ((red & 0xFF) << 16) | ((green & 0xFF) << 8) | ((blue & 0xFF) << 0);
	}
	
    public final int getRed() {
        return (RGBValue >> 16) & 0xFF;
    }
    
    public final int getGreen() {
        return (RGBValue >> 8) & 0xFF;
    }
    
    public final int getBlue() {
        return (RGBValue >> 0) & 0xFF;
    }
    
    public final int getAlpha() {
        return (RGBValue >> 24) & 0xff;
    }
    
    public final int getRGB() {
        return RGBValue;
    }
    
}
