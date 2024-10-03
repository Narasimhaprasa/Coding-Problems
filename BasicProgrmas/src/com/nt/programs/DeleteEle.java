package com.nt.programs;

public class DeleteEle {

	public static void main(String[] args) {
		int a[] = new int[10];
		a[0]=10;
		a[1]=20;
		a[2]=40;
		a[3]=30;
		a[4]=50;
		
		int delEle = 30, i, j,loc=-1,n=a.length;
		for (i = 0; i < a.length; i++) {
			if (a[i] == delEle) {
                loc=i;
                break;
			}
		}
		for(i=loc;i<n;i++) {
			a[i] = a[i+1];
		}
		n--;
		
		if(loc !=-1) {
			for(i=0;i<a.length;i++) {
				System.out.print(a[i]+"  ");
			} 
		}else {
			System.out.println("-1");
		}
	 }
}