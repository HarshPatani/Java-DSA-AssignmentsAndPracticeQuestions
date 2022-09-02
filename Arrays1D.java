package com.javaCodePractice;
import java.util.*;

public class Arrays1D {
    static boolean checkPalindrome(String word)
    {
        int n = word.length();
        word = word.toLowerCase();
        for (int i=0; i<n; i++,n--) {
            if (word.charAt(i) != word.charAt(n - 1)) {
                return false;
            }
        }
        return true;
    }
    static void reverseWord(String word){
        char ch;
        String reverseWord = "";

        for (int i=0; i<word.length(); i++)
        {
            ch= word.charAt(i); //extracts each character
            reverseWord= ch + reverseWord; //adds each character in front of the existing string
        }
        System.out.print(reverseWord+" ");
    }

    static int getSmallestPositive(int[] a) {
        boolean found = false;
        for (int i = 1;; i++) {
            found = false;
            for (int j = 0; j < a.length; j++) {
                int x = a[j];
                if (x == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i;
            }
        }
    }


    static void reverseString (String str) {

        String reverseStr ="";
        char ch;
        String [] stringWords = str.split(" ");
        int n = stringWords.length;
        int count=0;

        for (int i=0; i<n; i++)
        {
           reverseWord(stringWords[i]);
        }
        System.out.println(reverseStr);

        for (int i = 0; i <n; i++) {
            if(checkPalindrome(stringWords[i])){
                System.out.println(stringWords[i]);
                count++;
            }
        }
        if(count==0){
            System.out.println("NO PALINDROMES");
        }
    }

    static void moveZerosToEnd(int[] arr) {
        int n = arr.length;

        int count=0;
        for (int i = 0; i < n; i++) {

            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
        }
        while(count<n){
            arr[count] = 0;
            count++;
        }
        printArray(arr);
    }




    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }


    static void milkAndWater(int []arr){
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            int temp= arr[i];
            if (arr[i]<0){
                int j = i-1;
                while(j>=0 && arr[j]>=0){
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+1]=temp;
            }
        }
        printArray(arr);
    }

    static int [] unionOf2Arrays(int []arr1,int []arr2){
        // 5 6 7 8 9 10
        // 2 5 6 7 8 9 10
        int n = arr1.length;
        int m = arr2.length;
        int i = 0;
        int j = 0;
        int k = 0;
        int []brr = new int [m+n];
        while (i<n && j<m) {
            if(arr1[i]!=arr2[j]) {
                if (arr1[i] < arr2[j]) {     //int[] arr1 = {2,2,5};
                    brr[k] = arr1[i];        // int[] arr2 = {2,2,7};
                    k++;
                    i++;
                } else {
                    brr[k] = arr2[j];
                    k++;
                    j++;
                }
            }else{
                brr[k] = arr1[i];
                k++;
                i++;
                j++;
            }
        }
        while(i<n){
            brr[k]=arr1[i];
            k++;
            i++;
        }
        while(j<m) {
            brr[k] = arr2[j];
            k++;
            j++;
        }

        int[] copy = Arrays.copyOf(brr,k);
       return copy;
    }
    
    static int [] primeFactors(int a){
        int[] arr = new int [a];
        int j =0;
        for (int i = 2; i <= a;) {
            if(a%i==0){
                arr[j]=i;
                j++;
                a=a/i;
            }else {
                i++;
            }
        }
        int []copy = Arrays.copyOf(arr,j);
        return copy;
    }
    static int lcmOf2Numbers(int a,int b){
        int ans= 1;
        int []arr = primeFactors(a);
        int []brr = primeFactors(b);
        int []lcm = unionOf2Arrays(arr,brr);
        for (int i = 0; i < lcm.length; i++) {
             ans = ans*lcm[i];
        }
        return ans;

    }
    static void pattern(int n){
        int rows = (n/2)+1;
        for (int i = 1; i <=rows; i++) {
            for (int j =i; j <=rows ; j++) {
                System.out.print("*");
            }
            for (int j =1; j<=i*2-1 ; j++) {
                System.out.print(" ");
            }
            for (int j =i; j <=rows ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = rows-1; i >=1; i--) {
            for (int j =i; j <=rows ; j++) {
                System.out.print("*");
            }
            for (int j =1; j<=i*2-1 ; j++) {
                System.out.print(" ");
            }
            for (int j =i; j <=rows ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void addOne(int[]arr){
        int n = arr.length;
        arr[n-1]++;
        if(arr[n-1]%10==0){
            int []brr= new int [arr.length+1];
            for (int i = 0; i < arr.length; i++) {
                brr[i]=arr[i];
            }
            brr[arr.length]=0;
            brr[arr.length-1]=arr[n-1]/10;
            printArray(brr);
        }else{
            printArray(arr);
        }
    }
    static String goodString(String str){
        str= str.toLowerCase();
        int[] freq = new int [26];
        for (int i = 0; i < str.length(); i++) {
            int ind = str.charAt(i)-97;
            freq[ind]++;
        }
        int temp=0;
        for (int i = 0; i < 26; i++) {
            if(freq[i]>0){
                temp=freq[i];
                break;
            }
        }
        for (int i = 0; i < 26; i++) {
            if(freq[i]!=0 && freq[i]!=temp){
                return "False";
            }
        }
        return "True";
    }


    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int []arr = new int[size];
//        for (int i = 0; i < size; i++) {
//            arr[i]=sc.nextInt();
//        }
        String str = "aabcc";
        System.out.println(goodString(str));
//        int rows2 = sc.nextInt();
//        int cols2 = sc.nextInt();
//        int[][] arr2 = new int[rows2][cols2];
//        for (int i = 0; i < rows2; i++) {
//            for (int j = 0; j < cols2; j++) {
//                arr2[i][j]= sc.nextInt();
//            }
//        }
//        1 2 3 4 5 6 7 8 9
    }
} 
