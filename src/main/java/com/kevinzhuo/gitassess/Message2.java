package com.kevinzhuo.gitassess;

public class Message2 {
	
	public String origin;
	public String binaryrev;
	public Message2() {
		
	}
	
	public Message2(String s) {
		origin = s;
	}
	
	public void setOrigin(String s) {
		origin = s;
	}
	
	public void calc() {
		Integer num = Integer.parseInt(origin);
		binaryrev = Solutions.calcbinary(num).toString();
	}
}
