package com.javaex.ex04_Implements_Runnable;

public class DigitImpl implements Runnable {

	public void run() {
		for (int i = 0; i <= 31; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
