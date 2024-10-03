package in.ashokit.logical;

import java.util.Scanner;

/*POOLED CAB SERVICE

A compnay wishes to provide cab service for their N employees. The employees have distance ranging from 0 to N-1. 
The company has calculated the total distance from an employee's residence to the company, considering the path to be followed by the cab is a straight path.
 The distance of the company from it self is 0. The distance for the employees who live to the left side of the company is represented with a negative sign. 
 The distance for the employees who live to the right side of the company is represented with a positive sign. the cab will be allotted a range of distance. 
 The company wishes to find the distance for the employees who live within the particular distance range.
write a alogrithm to find the distance for the employees who live within the distance range.

input ----> size of the list N ,SD,ED and an array of distance
output ---> distance within the range else -1
con ------> con*/
public class LBP154 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, x1, x2, n;
		System.out.println("Number of employees::");
		n = sc.nextInt();
		System.out.println("Enter a x1 value ::");
		x1 = sc.nextInt();
		System.out.println("Enter a x2 value ::");
		x2 = sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter a values");
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		arrangeCabForEmployee(x1, x2, a, n);
	}

	public static void arrangeCabForEmployee(int x1, int x2, int a[], int n) {
		int i;
		for (i = 0; i < n; i++) {
			if (Math.abs(a[i]) >= x1 && Math.abs(a[i]) <= x2)
				System.out.print(a[i] + " ");
		}
	}
}
