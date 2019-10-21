package com.bacskai.game_engine2D.networking;

public class Host {
	
	String ip;
	int port;
	
	public Host() {}
	
	/**
	 * @param ip
	 * @param port
	 */
	public Host(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}
	
	public final String getIp() {
		return ip;
	}
	
	/**
	 * @param ip the ip to set
	 */
	public final void setIp(String ip) {
		this.ip = ip;
	}
	
	/**
	 * @return the port
	 */
	public final int getPort() {
		return port;
	}
	
	/**
	 * @param port the port to set
	 */
	public final void setPort(int port) {
		this.port = port;
	}
	
}
