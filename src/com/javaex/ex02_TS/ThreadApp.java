package com.javaex.ex02_TS;

public class ThreadApp {

	public static void main(String[] args) {

		Thread thread1 = new DigitThread();
		Thread thread2 = new UperThread();
		Thread thread3 = new LowerThread();

		thread1.start();
		thread2.start();
		thread3.start();

	}

}
