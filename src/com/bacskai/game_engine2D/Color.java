package com.bacskai.game_engine2D;

public class Color {
	
	private int RGBValue;
	
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
