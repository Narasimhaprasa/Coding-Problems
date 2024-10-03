package com.nt.programs;

class Super {
	public void add(int a, int b) {
		System.out.println("Add Opertion :::" + (a + b));
	}

	public void sub(int a, int b) {
		System.out.println("Sub OPertion ::" + (a - b));
	}
}

public class MethodOverloadingDemo extends Super {
	public void multiply(int a ,int b) {
		System.out.println("Multiplly Opertion::"+(a*b));
	}
	public void add(float f1, float f2) {
		System.out.println("Add Opertion :::"+(f1+f2));
	}
	public static void main(String[] args) {
       // create Object 
		MethodOverloadingDemo demo = new MethodOverloadingDemo();
		demo.add(10, 20);
		demo.multiply(10, 20);
		demo.sub(10, 5);
		demo.add(100.0f, 200.f);
		demo.add(100, 200);
	}
}
