package in.ashokit.logical;

import java.util.Scanner;

/*The garments company apparel wishes to open outlets at various locations. The company shortlisted several plots in these locations and wishes to 
 * select only plots that are square shaped. Write an algorithm to help Apparel find the number of plots that it can select for its outlets.

input --------> input consists of an integer N, and A1,A2,...AN representing areas of outlets.
constraint ---> 1>=size of the array<=100
output -------> print an integer representing the number of plots selected for outlets.

Ex:
	5
	1 2 3 4 5
	count=1+1=2*/

public class LBP153 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :::");
		int size = sc.nextInt();

		int[] a = new int[size];
		System.out.println("Enter a[] the values ::");
		for (int i = 0; i < size; i++) {
			int value = sc.nextInt();
			a[i] = value;
		}
		int bookedPlots = selectedPlots(a, size);
		System.out.println("No of plots are booked ::" + bookedPlots);
	}

	public static int selectedPlots(int a[], int size) {
		int i, k, count = 0;
		for (i = 0; i < size; i++) {
			for (k = 1; k <= a[i]; k++) {
				if (k * k == a[i])
					count++;
			}
		}
		return count;
	}
}
