package in.ashokit.DSA;

public class BubbleSort {

	public static void main(String[] args) {
		//	int arr[] = { 5, 1, 4, 2, 8 };
		//	int arr[] = { 1, 2, 3, 4, 5 };
		int arr[] = { 64, 34, 12, 22, 11, 90 };
		BubbleSort ob = new BubbleSort();
		ob.bubbleSort(arr);
		System.out.println("Sorted Array::");
		ob.printArray(arr);
	}

	public void bubbleSort(int arr[]) {
		int n = arr.length, i, temp, count = 0;
		for (i = 0; i < n - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				count = count + 1;
			}
		}
		if (count == 0)
			return;
		bubbleSort(arr);

	}

	/*public void bubbleSort(int arr[]) {
		int n = arr.length, i, j, temp;
		boolean flag;
		for (i = 0; i < n - 1; i++) {
			flag = false;
			for (j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
			}
			  if(flag == false)
	    	  break;
		}
	}*/

	public void printArray(int arr[]) {
		int n = arr.length, i;
		for (i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
}
