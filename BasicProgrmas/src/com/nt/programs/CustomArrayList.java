package com.nt.programs;

public class CustomArrayList {

	private static Object[] ar = null;
	int index = 0;

	public CustomArrayList() {
		ar = new Object[5];
	}

	public CustomArrayList(int capacity) {
		ar = new Object[capacity];
	}

	public void insert(Object obj) {
		if (index >= ar.length) {
			int newLength = ar.length + (ar.length / 2);
			Object[] newObj = new Object[newLength];
			for (int i = 0; i < ar.length; i++) {
				newObj[i] = ar[i];
			}

			ar = newObj;
		}
		ar[index] = obj;
		index = index + 1;

	}

	public Object get(int index) {
		Object obj = ar[index];
		return obj;
	}

	public int size() {
		return index;
	}

	public boolean contains(Object key) {
		int i, len = ar.length;
		boolean flag = false;
		for (i = 0; i < len; i++) {
			Object val = ar[i];
			if (val.equals(key)) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	public void print() {
		int i = 0;
		System.out.print("[");
		for (i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + ",");
		}
		System.out.print("]");
	}

	public String isFull() {
		if (index >= ar.length)
			return "Stack is full";
		else
			return "stack is not Full";
	}

	public void isEmpty() {
		if (index == 0)
			System.out.println("Stack is empty");
		else
			System.out.println("Stack is not empty");
	}

	public void sort() {
		int i, j, temp, len = ar.length;
		for (i = 0; i < len; i++) {
			int s1 = (int) ar[i];
			for (j = i + 1; j < len; j++) {
				int s2 = (int) ar[j];
				if (s1 > s2) {
					temp =(int) ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
	}
}
