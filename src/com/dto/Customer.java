package com.dto;

public class Customer extends Thread {
	
	@Override
	public void run() {
		System.out.println("Customer thread is running!!!");
	}
	
}
