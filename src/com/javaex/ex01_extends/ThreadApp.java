package com.javaex.ex01_extends;

public class ThreadApp {

	public static void main(String[] args) throws Exception {

		Thread thread = new DigitThread_Class();
		thread.start();							//		thread.run()
		for(char ch = 'A'; ch<='Z'; ch++) {
			System.out.println(ch);
			Thread.sleep(1000);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
