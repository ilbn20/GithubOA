package com.kevinzhuo.gitassess;

public class Message {
	
	public String origin;
	public String longestpalin;
	public Message() {
		
	}
	
	public Message(String s) {
		origin = s;
	}
	
	public void setOrigin(String s) {
		origin = s;
	}
	
	public void calc() {
		longestpalin = Solutions.calc(origin);
	}
	
}
