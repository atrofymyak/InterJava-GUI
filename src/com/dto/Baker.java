package com.dto;

public class Baker extends Thread {
	
	@Override
	public void run() {
		System.out.println("Baker thread is running!!!");
	}
	
}
