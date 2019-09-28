package com.bacskai.game_engine2D.networking;

import com.bacskai.game_engine2D.StreamReciever;
import com.bacskai.game_engine2D.Streamable;

/**
 * 
 * @author Bácskai Kristóf
 */
public class NetworkManager implements Streamable, StreamReciever {
	
	public NetworkManager() {}
	
	public void recieve(Object o) {
	}
	
	public boolean write(Object o) {
		return false;
	}
	
}
