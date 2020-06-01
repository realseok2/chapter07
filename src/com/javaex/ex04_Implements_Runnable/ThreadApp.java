package com.javaex.ex04_Implements_Runnable;

public class ThreadApp {

	public static void main(String[] args) throws Exception{

		Thread thread1 = new Thread(new DigitImpl());
		Thread thread2 = new Thread(new UperImpl());
		Thread thread3 = new Thread(new LowerImpl());

		thread1.start();
		thread2.start();
		thread3.start();

	}

}
