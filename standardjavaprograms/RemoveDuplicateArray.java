package com.technoelevate.newstandardprograms;

import java.util.Scanner;

public class RemoveDuplicateArray {
public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a[]=sc.nextInt();
        
        for(int i=0;i<a.length;i++){
            for(int j=i+1 ;j<a.length;j++){
                if(a[i]==a[j]){
                    a[j]=0;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!=0) {
            	 System.out.print(a[i]+" ");
            }
            else {
                 System.out.print("");
            }
        }
    }

}
