package com.example.FIRST;

public class Runner extends Game1 {
	A a;
	Runner(A a)
	{
		this.a=a;
		
	}
	
	

	void run() {
		
		a.down();
		a.left();
		a.up();
		a.right();
	}
	
	
	
	/*
	 * public static void callThread1()
	 * 
	 * {
	 * 
	 * Game1 g1=new Game1(); System.out.println("Running Game1 Class"); g1.down();
	 * g1.left(); g1.right(); g1.up();
	 * 
	 * System.out.println();
	 * 
	 * }
	 * 
	 * public static void callThread2()
	 * 
	 * {
	 * 
	 * Game2 g2=new Game2(); System.out.println("Running Game2 Class"); g2.down();
	 * g2.left(); g2.right(); g2.up(); System.out.println();
	 * 
	 * }
	 * 
	 * public static void callThread3()
	 * 
	 * {
	 * 
	 * Game3 g3=new Game3(); System.out.println("Running Game3 Class"); g3.down();
	 * g3.left(); g3.right(); g3.up(); System.out.println();
	 * 
	 * }
	 */

	
	
}
