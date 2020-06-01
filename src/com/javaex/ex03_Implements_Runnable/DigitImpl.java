package com.javaex.ex03_Implements_Runnable;

public class DigitImpl implements Runnable {

	public void run() {
		for (int i = 0; i <= 25; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
