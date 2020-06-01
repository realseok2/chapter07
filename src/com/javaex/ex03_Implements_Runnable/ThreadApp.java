package com.javaex.ex03_Implements_Runnable;

public class ThreadApp {

	public static void main(String[] args) throws Exception {

		/*
		 * DigitImpl di = new DigitImpl(); Thread thread = new Thread(di);
		 */

		Thread thread = new Thread(new DigitImpl());
		thread.start();

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			Thread.sleep(1000);
		}

	}

}
