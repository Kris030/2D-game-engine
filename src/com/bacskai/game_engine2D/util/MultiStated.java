/**
 * 
 */
package com.bacskai.game_engine2D.util;

/**
 * @author hentesopossszum
 *
 */
public interface MultiStated<T> {
	
	public T getState();
	
	public void setState(T o);
	
}
