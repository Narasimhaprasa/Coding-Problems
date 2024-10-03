package com.nt.programs;
 

public class BinarySearch {

	public static void main(String[] args) {
		int a[] = { 1, 10, 20, 101, 65, 89, 99, 101 };
		int size = a.length, key = 101;
		binarySearch(a, size, key);
	//	List<Integer>in= new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			if(a[i] == key) {
		System.out.print(","+i);
			}	
		}
	}

	public static void binarySearch(int a[], int size, int key) {

		int first = 0, last = size - 1, mid;
		while (first <= last) {
			mid = (first + last) / 2;
			if (key < a[mid]) {
				last = mid - 1;
			} else if (key > a[mid]) {
				first = mid + 1;
			} else if (key == a[mid]) {
				System.out.println("The element is fount a position at :::" + mid);
				break;
			}
		}
	}
}
