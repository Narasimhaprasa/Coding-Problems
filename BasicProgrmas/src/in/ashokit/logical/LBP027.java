package in.ashokit.logical;

import java.util.Scanner;

/*Find The Sequence Sum

Given three integers i,j&k, a sequence sum to be the value of i+(i+1)+(i+2)..+j+(j-1)+(j-2)+..+k
(increment from i until it equals to j, then decrement from j until equals k). Given values i,j,k. 
caluclate the sequence sum as described.

int getSequenceSum(int,int,int);

input -------> Three int values
constraints--> no
output ------> sum basd on given constraints*/
public class LBP027 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter i value ::");
	 int i =sc.nextInt();
	 System.out.println("Enter j value ::");
	 int j = sc.nextInt();
	 System.out.println("Enter k value ::");
	 int k = sc.nextInt(),sum=0;
	 
	 while(i<=j)
		 sum = sum + i++;
	 
	 while(j>k)
		 sum = sum + --j;
	 System.out.println(sum);

	}

}
