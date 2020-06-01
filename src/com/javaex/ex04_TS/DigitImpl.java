package com.javaex.ex04_TS;

public class DigitImpl implements Runnable {

	@Override
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
