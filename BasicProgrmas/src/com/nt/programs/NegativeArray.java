package com.nt.programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class NegativeArray {

	public static void main(String[] args) {
		int list[] = { 10, -3, 5, 6, 90, -78, 34, 56, -21, 68, 42 };

		int positiveElements[] = new int[10];
		int negativeElements[] = new int[5];

		int i, j, positiveCount = 0, negativeCount = 0, tempEle = 0, negativeEle;
		for (i = 0; i < list.length; i++) {
			if (list[i] < 0) {
				negativeElements[negativeCount] = list[i];
				negativeCount++;
			} else {
				positiveElements[positiveCount] = list[i];
				positiveCount++;
			}
		}
		// to count the negative elements in the given array
		System.out.println("negative elements count ::" + negativeCount);
		System.out.println("Postive elements count::" + positiveCount);

		// to retrive the positive elements in the given array
		System.out.println("Positive Elements :: ");
		for (int ele : positiveElements) {
			System.out.print(ele + "  ");
		}
		System.out.println();
		System.out.println("negative elements ::");
		for (int ele : negativeElements) {
			System.out.print(ele + "  ");
		}
		System.out.println("===================================================");
		// to sort the  postive elements in the given array
		for (i = 0; i < positiveElements.length; i++) {
			for (j = i + 1; j < positiveElements.length; j++) {
				if (positiveElements[i] > positiveElements[j]) {
					tempEle = positiveElements[i];
					positiveElements[i] = positiveElements[j];
					positiveElements[j] = tempEle;
				}
			}
		}
		//System.out.println(tempEle);
		System.out.println("Ascending order Positive Elements :: ");
		for (int ele : positiveElements) {
			System.out.print(ele + "  ");
		}
		System.out.println();

		// to sort the negative elements in the given array
		for (i = 0; i < negativeElements.length; i++) {
			for (j = i + 1; j < negativeElements.length; j++) {
				if (negativeElements[i] > negativeElements[j]) {
					negativeEle = negativeElements[i];
					negativeElements[i] = negativeElements[j];
					negativeElements[j] = negativeEle;

				}
			}
		}
		System.out.println("Ascending order negative Elements :: ");
		for (int ele : negativeElements) {
			System.out.print(ele + "  ");
		}

		// to print the whose valves greater than 50
		int greaterEle[] = new int[positiveCount + 2];
		/*for(i=0;i<positiveElements.length;i++) {
			if(positiveElements[i]>50) {
			     greaterEle[i] = positiveElements[i];
			}
		}*/
		List<Integer> arrayList = new ArrayList<Integer>();
		for (i = 0; i < positiveElements.length; i++) {
			if (positiveElements[i] > 50) {
				arrayList.add(positiveElements[i]);
			}
		}
		System.out.println();
		/*System.out.println("To printing the elements whose values greater than 50 :: ");
		for(int ele : greaterEle) {
			System.out.print(ele+"  ");
		}*/
		System.out.println(arrayList);

		/*ListIterator<Integer> listIterator = arrayList.listIterator();
		while (listIterator.hasNext()) {
			Integer next = listIterator.next();
			System.out.println(next);
		}*/

		/*Iterator<Integer> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			Integer next = iterator.next();
			System.out.println(next);
		}
		*/
		
	

	}
}
