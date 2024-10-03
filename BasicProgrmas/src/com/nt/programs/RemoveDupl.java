package com.nt.programs;

public class RemoveDupl {

	public static void main(String[] args) {
		int a[] = { 10, 20, 10, 20, 30, 40, 50 };
		int i,j, temp ;
		int res[] = new int[a.length];
		for (i = 0; i < a.length; i++) {
			for (j = i + 1; j <= a.length; j++) {
				if(a[i] != a[j]) {
					 res[i] = a[i];
				} 
			 
			}
				
		}
		for(int ele : res) {
			System.out.print(ele+" ");
		}
	 
	}

}
