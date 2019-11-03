package com.bacskai.game_engine2D.util;

import com.bacskai.game_engine2D.exceptions.UninstantiatableException;

public final class Utilities {
	
	private Utilities() throws UninstantiatableException {
		throw new UninstantiatableException();
	}
	
	public static final double random(double min, double max) {
		if (max < min)
			throw new IllegalArgumentException("Invalid range " + min + " - " + max);
		else if (min == max)
			return min;
		else
			return Math.random() * max + min;
	}
	
	public static final double[] random(double min, double max, int length) {
		if (length <= 0)
			throw new IllegalArgumentException("Invalid length value - " + length);
		
		double[] d = new double[length];
		for (int i = 0; i < d.length; i++)
			d[i] = random(min, max);
		return d;
	}
	
	public static final double[][] random(double min, double max, int[] lengths) {
		double[][] d = new double[lengths.length][];
		for (int i = 0; i < d.length; i++)
			d[i] = random(min, max, lengths[i]);
		return d;
	}
	
	public static final int random(int min, int max) {
		if (max < min)
			throw new IllegalArgumentException("Invalid range " + min + " - " + max);
		else if (min == max)
			return min;
		else
			return (int) (Math.random() * max + min);
	}
	
	public static final int[] random(int min, int max, int length) {
		if (length <= 0)
			throw new IllegalArgumentException("Invalid length value - " + length);
		
		int[] d = new int[length];
		for (int i = 0; i < d.length; i++)
			d[i] = random(min, max);
		return d;
	}
	
	public static final int[][] random(int min, int max, int[] lengths) {
		int[][] d = new int[lengths.length][];
		for (int i = 0; i < d.length; i++)
			d[i] = random(min, max, lengths[i]);
		return d;
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
