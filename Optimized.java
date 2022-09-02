package com.javaCodePractice;

import java.util.Scanner;

public class Optimized {

    static boolean primeNumCheck(int num){
        if(num==0||num==1){
            return false;
        }else{
            for (int i = 2; i <=Math.sqrt(num); i++) {
                if(num%i==0){
                    return false;
                }
            }
        }
        return true;

    }

    static void printFactors(int num){
        for (int i = 1; i <=Math.sqrt(num); i++) {
            if(num%i==0){
                if(num/i==i){
                    System.out.print(i+" ");
                }else {
                    System.out.print(i + " " + num / i + " ");
                }
            }
        }
    }

    static int binarySearchAscendingSorted(int []arr,int ele){  //input ascending sorted array and element to be searched
        int ind = -1; //index=ind
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(ele==arr[mid]){
                ind = mid;
                return ind;
            }else if(ele<arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ind;
    }
    static int binarySearchDescendingSorted(int []arr,int ele){  //input descending sorted array and element to be searched
        int ind = -1; //index=ind
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(ele==arr[mid]){
                ind = mid;
                return ind;
            }else if(ele<arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ind;
    }

    static int binarySearch(int []arr,int ele){  //input descending sorted array and element to be searched
        int n = arr.length;
        if(arr[0]<arr[n-1])
            return binarySearchAscendingSorted(arr,ele);
        else
            return binarySearchDescendingSorted(arr,ele);
    }

    static int firstOccurrence(int []arr, int ele){
        int ind = -1; //index=ind
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(ele==arr[mid]){
                ind = mid;
                while(arr[mid]==arr[mid-1]){
                    mid=mid-1;
                }
                ind=mid;
                return ind;
            }else if(ele<arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ind;
    }

    static int lastOccurrence(int []arr, int ele){
        int ind = -1; //index=ind
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(ele==arr[mid]){
                ind = mid;
                while(arr[mid]==arr[mid+1]){
                    mid=mid+1;
                }
                ind=mid;
                return ind;
            }else if(ele<arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ind;
    }

    static int firstOcc(int []arr,int ele){  //input ascending sorted array and element to be searched
        int ind = -1; //index=ind
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(ele==arr[mid]){
                ind = mid;
                end = mid-1;
            }else if(ele<arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ind;
    }

    static int lastOcc(int []arr,int ele){  //input ascending sorted array and element to be searched
        int ind = -1; //index=ind
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(ele==arr[mid]){
                ind = mid;
                start = mid+1;
            }else if(ele<arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ind;
    }
    static int transitionPoint(int []arr){  //input ascending sorted array of zeros and ones only
        int ind = -1; //index=ind
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==0){
                start = mid+1;
            }else{
                ind=mid;
                end=mid-1;
            }
        }
        return ind;
    }

    static int justGreaterElement(int []arr,int ele){  //input ascending sorted array and element to be searched
        int ind= -1; //index=ind
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]<=ele){
                start = mid+1;
            }else{
                ind=mid;
                end=mid-1;
            }
        }
        if(ind==-1)
            return Integer.MIN_VALUE;
        return arr[ind];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]= sc.nextInt();
        }
        int key = sc.nextInt();
        System.out.print(firstOcc(arr,key)+" ");
        System.out.print(lastOcc(arr,key)+" ");
        if(firstOcc(arr,key)==-1 || lastOcc(arr,key)==-1) {
            System.out.println(0);
        }else
            System.out.print(lastOcc(arr,key)-firstOcc(arr,key)+1);

    }
}
