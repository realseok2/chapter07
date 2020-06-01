package com.javaex.ex02_extends;

public class ThreadApp {

	public static void main(String[] args) {

		Thread thread1 = new DigitThread();
		Thread thread2 = new LowerThread();
		Thread thread3 = new UperThread();

		thread1.start();
		thread2.start();
		thread3.start();

	}

}
