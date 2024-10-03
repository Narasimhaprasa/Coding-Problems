package in.ashokit.DSA;

public class InsertionSort {

	public static void main(String[] args) {
		//	int arr[] = { 12, 11, 13, 5, 6 };
		int arr[] = { 5, 1, 4, 6, 3, 2, 9 };
		InsertionSort ob = new InsertionSort();
		ob.sort(arr);
		System.out.println("Sorted Array::");
		ob.printArray(arr);
	}

	public void sort(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	public void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
}
