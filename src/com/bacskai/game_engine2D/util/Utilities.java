package com.bacskai.game_engine2D.util;

import com.bacskai.game_engine2D.exceptions.UninstantiatableException;

public final class Utilities {
	
	private Utilities() throws UninstantiatableException {
		throw new UninstantiatableException();
	}
	
	public static final byte[] autoboxArray(Byte[] array) {
		byte[] b = new byte[array.length];
		int i = 0;
		for (byte value : array)
			b[i++] = value;
		return b;
	}
	
	public static final Byte[] autoboxArray(byte[] array) {
		Byte[] b = new Byte[array.length];
		int i = 0;
		for (byte value : array)
			b[i++] = value;
		return b;
	}
	
}
