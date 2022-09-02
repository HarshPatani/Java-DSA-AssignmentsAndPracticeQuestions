package com.javaCodePractice;

import java.util.Scanner;

public class Main {

    static void bubbleSort(int []array) {
        int temp;
        for (int j = 0; j < array.length; j++) {

            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i] < array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }
    static void selectionSort(int[] arr) {
        int n = arr.length;

        // One by one move boundary of unsorted sub-array
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    static void insertionSort(int [] array){

        for (int i = 0; i < array.length; i++) {
            int j = i-1;
            while(j>=0 && array[j]>array[j+1]){
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
                j--;
            }
        }
    }

    static void fibonacci(int n){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int c = 0;
        if (n==1){
            System.out.print(a);
        }else if (n==2){
            System.out.print(b);
        }else{
            for (int i = 1; i <= n-2; i++) {
                c = a+b;
                a = b;
                b = c;

            }
            System.out.print(c);
        }

    }

    static void arrayPalindrome(int []array,int n){
        boolean flag = true;
        int i =0 ;
        int j =n-1 ;
        while(i<=j){
            if(array[i] != array[j]){
                flag= false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(flag);
    }

    static void printArrayWithFor(int[]arr){

            for (int i = 0; i < arr.length ; i++) {
                System.out.print(arr[i] +" ");
            }
    }

    static void mountainArray(int []array,int n){
        int max = Integer.MIN_VALUE;
        boolean flag = true;
        if(n<3){
            flag = false;
        }else {
            for (int i = 0; i < n; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            for (int i = 0; i < n; i++) {
                if (array[0] > max || array[n - 1] > max) {
                    flag = false;
                    break;
                }
            }
            System.out.println(flag);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        // TAKING ARRAY SIZE INPUT
        int []arr = new int[size];
        // TAKING ARRAY INPUT
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        mountainArray(arr,size);
    }
}
