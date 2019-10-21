package com.bacskai.game_engine2D.networking;

import com.bacskai.game_engine2D.util.MultiStated;
import com.bacskai.game_engine2D.util.StreamReciever;
import com.bacskai.game_engine2D.util.Streamable;

/**
 * 
 * @author Bácskai Kristóf
 */
public class NetworkManager implements Streamable<byte[]>, StreamReciever<byte[]>, MultiStated<NetworkProtocol> {
	
	public NetworkProtocol getState() {
		return null;
	}
	
	public void setState(NetworkProtocol o) {
	}
	
	public byte[] recieve() {
		return null;
	}
	
	public boolean write(byte[] data) {
		return false;
	}
	
}
