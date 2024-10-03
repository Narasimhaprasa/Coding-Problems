package com.nt.programs;

public class CustomAL {

	public static void main(String[] args) {
		CustomArrayList cl = new CustomArrayList(5);
		cl.insert(10);
		cl.insert(30);
		cl.insert(20);
		cl.insert(40);
		cl.insert(60);
		cl.insert(50);
		cl.insert(70);
		int size = cl.size();
		System.out.println("Size of ArrayList :" + size);

		boolean res = cl.contains(10);
		System.out.println(res);

		cl.print();
		String full = cl.isFull();
		System.out.println(full);

		cl.isEmpty();
		cl.sort();
		cl.print();
	}

}
