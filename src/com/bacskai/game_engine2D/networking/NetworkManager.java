package com.bacskai.game_engine2D.networking;

import com.bacskai.game_engine2D.util.StreamReciever;
import com.bacskai.game_engine2D.util.Streamable;

/**
 * 
 * @author B�cskai Krist�f
 */
public class NetworkManager implements Streamable, StreamReciever {
	
	public NetworkManager() {}
	
	public void recieve(Object o) {
	}
	
	public boolean write(Object o) {
		return false;
	}
	
}
