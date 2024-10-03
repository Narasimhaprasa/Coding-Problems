package com.nt.programs;

import java.util.Arrays;

/*100
63, 25, 73, 1, 98, 73, 56, 84, 86, 57, 16, 83, 8, 25, 81, 56, 9, 53, 98, 67, 99, 12, 83, 89, 80, 91, 39, 86, 76, 85, 74, 39, 25, 90, 59, 10, 94, 32 ,44, 
3, 89, 30 ,27 ,79 ,46, 96, 27,32, 18, 21, 92, 69, 81, 40, 40, 34, 68, 78, 24, 87, 42, 69, 23, 41, 78, 22, 6 ,90, 99, 89, 50, 30, 20, 1, 43,
 3, 70, 95, 33, 46 ,44, 9, 69, 48, 33, 60, 65, 16, 82, 67 ,61, 32, 21, 79,75, 75, 13, 87, 70, 33 */
public class ArrayListMethods {
	
	public static void main(String[] args) {
  long l[] = new long[100];
  Long[] ll = new Long[100];
		int arr[] = { 63, 25, 73, 1, 98, 73, 56, 84, 86, 57, 16, 83, 8, 25, 81, 56, 9, 53, 98, 67, 99, 12, 83, 89, 80,
				91, 39, 86, 76, 85, 74, 39, 25, 90, 59, 10, 94, 32, 44, 3, 89, 30, 27, 79, 46, 96, 27, 32, 18, 21, 92,
				69, 81, 40, 40, 34, 68, 78, 24, 87, 42, 69, 23, 41, 78, 22, 6, 90, 99, 89, 50, 30, 20, 1, 43, 3, 70, 95,
				33, 46, 44, 9, 69, 48, 33, 60, 65, 16, 82, 67, 61, 32, 21, 79, 75, 75, 13, 87, 70, 33 };
		int size = arr.length;
		
		/*List<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < size; i++)
			al.add(arr[i]);*/
		
		int[] ar = count(arr, size);
		System.out.println(Arrays.toString(ar));
		
		/*List<Integer> res = countingSort(al);
		System.out.println(res);*/
	}

	public static int[] count(int arr[], int size) {
		int i, j;
		int freq[] = new int[size];
		for (i = 0; i < size; i++) {
			int value = arr[i];
			int count = 0;
			for (j = 0; j < size; j++) {
				if ( value == arr[j])
					count++;
			}
			freq[value] = count;
		}
		return freq;
	}
	/*	public static List<Integer> countingSort(List<Integer> arr) {
			// Write your code here
			List<Integer> valueCount = new ArrayList<Integer>();
			int i, len = arr.size();
			for (i = 0; i < len; i++)
				valueCount.add(0);
	
			for (int value : arr) {
				valueCount.set(value, valueCount.get(value) + 1);
			}
			return valueCount;
		}*/

}
