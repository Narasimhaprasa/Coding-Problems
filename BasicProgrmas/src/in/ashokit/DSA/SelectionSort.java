package in.ashokit.DSA;

public class SelectionSort {

	public static void main(String[] args) {
		//	int arr[] = { 64, 25, 12, 22, 11 };
		int arr[] = { 23, 12, 45, 1, 3, 5 };
	//	int arr[] = { 1, 2, 3, 4, 5 };
		SelectionSort ob = new SelectionSort();
		ob.sort(arr);
		System.out.println("Sorted Array::");
		ob.printArray(arr);
	}

	public void sort(int arr[]) {
		int n = arr.length;
		boolean flag;
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			flag = false;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
					flag = true;
				}
			}
			if (flag == false)
				break;
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

	public void printArray(int arr[]) {
		int n = arr.length, i;
		for (i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
}
