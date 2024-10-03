package com.nt.programs;

class Test {
	/*public void check(int b) {
		System.out.println("int executed");
	}
	
	public void check(long s) {
		System.out.println("long executed ");
	}*/
	/*public void check(String  b) {
		System.out.println("String  executed");
	}
	
	public void check(Object s) {
		System.out.println("object executed ");
	}*/
	
	public void input(int ...a) {
		//System.out.println("Executed ");
		int total =0;
		for(int b : a) {
			total = total+b;
			System.out.println("Sum of parameters ::"+total);
		}
	}
}

public class Test01 {
	public static void main(String[] args) {
      Test t = new Test();
      t.input();
		  t.input(5);
		  t.input(5,10);
		  t.input(5,10,20);
	}
}
