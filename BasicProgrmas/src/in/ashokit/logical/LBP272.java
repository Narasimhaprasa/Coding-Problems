package in.ashokit.logical;

import java.util.Scanner;

/*Item id

A company wishes to bucketize their item id's for better search operations. The bucket for the item ID is chosen on the basis of the maximum 
value of the digit in the item ID. Writean algorithm to find the bucket to which the item ID will be assigned.

input -----> ItemId
con -------> no
output ----> bucket ID*/

public class LBP272 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a bucket ID ::");
		int id = sc.nextInt();
		int itemId = findItemId(id);
		System.out.println("we need to assigned item id to bucket ::" + itemId);
	}

	public static int findItemId(int id) {
		int remainder, md = 0;
		while (id != 0) {
			remainder = id % 10;
			if (md < remainder)
				md = remainder;
			id = id / 10;
		}
		return md;
	}
}
