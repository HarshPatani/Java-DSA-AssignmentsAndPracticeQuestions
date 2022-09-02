package com.javaCodePractice;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class OOPS {
   void walk(){
       System.out.println("Walking...........");
   }

   String laugh(){
       return "hahahaha";
   }
}

class Harsh{

    static void printPatternX(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j==i || i+j==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static int largestDivisibleByX(int n,int []arr,int x){
        int []brr= new int [n];
        int j =0;
        for (int i = 0; i < n; i++) {
            if(arr[i]%x==0){
                brr[j]=arr[i];
                j++;
            }
        }
        if(j==0){
            return -1;
        }
        int max= Integer.MIN_VALUE;
        for (int i = 0; i < brr.length; i++) {
            if(brr[i]>max){
                max=brr[i];
            }
        }
        return max;
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
//        int n = sc.nextInt();
//        int []arr= new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i]=sc.nextInt();
//        }
//        int x = sc.nextInt();
          int n =5;
          int[] arr= {1,1,1,1,1};
          int x =3;

        System.out.println(largestDivisibleByX(n,arr,x));

    }

}
