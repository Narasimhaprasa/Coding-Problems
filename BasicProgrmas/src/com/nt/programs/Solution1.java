package com.nt.programs;

import java.io.*;
import java.util.*;

public class Solution1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int a[][] = new int[3][3];
         int i,j;
         for(i=0;i<3;i++){
                 for(j=0;j<3;j++){
                         a[i][j] = sc.nextInt();
                 }
         }
            int flag = 1;
            for(i=0;i<3;i++){
                    for(j=0;j<3;j++){
                            if(i==j && a[i][j]!=1){
                                    flag = 0;
                                    break;
                            }
                             if(i!=j && a[i][j]!=0){
                                    flag = 0;
                                    break;
                            }
                                    
                    }
            }
            if(flag==1)
                    System.out.println("Yes");
            else
                    System.out.println("No");
    }
}