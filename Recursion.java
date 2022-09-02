package com.javaCodePractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Recursion {
    static void printNums(int n){

        if (n == 1) {
            System.out.print(n);
            return;
        }
        printNums(n - 1);
        System.out.print(n);
    }

    static int powerOf2(int n){
        if(n==0)
            return 1;
        else if(n%2==0)
            return powerOf2(n/2)*powerOf2(n/2);
        else
            return 2*powerOf2(n-1);
    }

    static int fibo(int n){
        if(n==1)
            return 0;
        else if(n==2)
            return 1;
        else return fibo(n-1)+fibo(n-2);
    }

    static int [] printReverseArray(int []arr,int n,int i){
        if(n==1){
            arr[i]=arr[0];
            return arr;
        }
        arr[i]=arr[n-1];
        i++;
        return printReverseArray(arr,n-1,i);
    }

    static void printArray(int []arr,int n){
        if(n==1){
            System.out.print(arr[0]+" ");
            return;
        }
        printArray(arr,n-1);
        System.out.print(arr[n-1]+" ");
    }

    static int sumOfArray(int []arr,int n){
        int sum;
        if(n==0){
            sum =0;
            return sum;
        }
        sum= arr[n-1] + sumOfArray(arr,n-1);
        return sum;
    }

    static int maxElementInArray(int []arr,int n){
        int max;
        if(n==0){
            max =Integer.MIN_VALUE;
            return max;
        }
        max= Math.max(maxElementInArray(arr,n-1),arr[n-1]);
        return max;
    }

    static boolean isArraySorted(int []arr,int n){
        if (n==0 || n==1)
            return true;
        return  (arr[n-1]>=arr[n-2]) && isArraySorted(arr,n-1);
    }

    static void subsets(String str,String op ){
        if (str.length()==0){
            System.out.println("SubString "+op);
            return;
        }
        subsets(str.substring(1),op+str.charAt(0));
        subsets(str.substring(1),op);
    }

    static void subsetsLetterCase(String s, String op,List<String> list) {
        if(s.length()==0) {
            list.add(op);
            return;
        }
        char ch = s.charAt(0);
        if(Character.isAlphabetic(ch)) {
            subsetsLetterCase(s.substring(1), op + Character.toLowerCase(ch), list);
            subsetsLetterCase(s.substring(1), op + Character.toUpperCase(ch), list);
        }else
            subsetsLetterCase(s.substring(1),op+ch,list);
    }

    static int reverseNumber(int n,int sum) { // pass sum =0;
        if(n<10){
            sum = sum*10 + n;
            return n;
        }
        int rem = n%10;
        sum = (sum*10)+rem;
         return reverseNumber(n/10,sum);
    }

    static String reverseString(String str,String rev) {// pass rev = "";
        int n = str.length();
        if(n==0){
            return rev;
        }
        rev = Character.toString(str.charAt(n-1))+rev;
        return reverseString(str.substring(0,n-1),rev);
    }

    static boolean isPalinString(String str,String rev) {

        return reverseString(str,"")==str;
    }

    static boolean palinString(String str,int start,int end) { // pass start=0 & end = str.length()-1
        if(start>= end){
            return true;
        }
        return str.charAt(start)==str.charAt(end) && palinString(str,start+1,end-1);
    }

    static boolean isPalindrome(int num,int sum) {
        return reverseNumber(num,sum)==num;
    }

    static int [] ReverseArray(int []arr,int n,int i){
        if(n==arr.length/2){
            return arr;
        }
        int temp = arr[i];
        arr[i]=arr[n-1];
        arr[n-1]=temp;
        i++;
        return ReverseArray(arr,n-1,i);
    }
    static void ReverseArrayList(ArrayList<Integer> arr){
        if(arr.size()==1){
            return;
        }
        int alpha = arr.remove(0);
        ReverseArrayList(arr);
        arr.add(alpha);
    }
    static void uniquePowerStrings(String str,String op ){
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        if (str.length()==0){
            if(hm.containsKey(op)==false) {
                hm.put(op, 1);
                System.out.println("SubString " + op);
                return;
            }
        }
        uniquePowerStrings(str.substring(1),op+str.charAt(0));
        uniquePowerStrings(str.substring(1),op);
    }



    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String s = "aaa";
        String op = "";
        System.out.println(fibo(5));
        // 0 1 1 2 3



    }
}
