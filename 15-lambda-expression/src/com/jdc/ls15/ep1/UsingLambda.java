package com.jdc.ls15.ep1;

public class UsingLambda {
	
	public static void main(String[] args) {
		Thread thread = new Thread(() -> System.out.println("Hello Lambda"));
		thread.start();
	}

}
