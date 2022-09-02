package com.javaCodePractice;

import java.util.Arrays;

public class Strings {
    static String reverseString(String str){
        String newStr = "";
        for (int i = str.length()-1; i >=0; i--) {
            newStr= newStr+ str.charAt(i);
        }
        return newStr;
    }

    static void countNumberOfSpaces(String str){
        int count =0;
        for (int i = 0; i <str.length(); i++) {
            if(str.charAt(i)==' '){
                count++;
            }
        }
        System.out.println(count);
    }

    static void countVowels(String str){
        int count =0;
        String lowerStr = str.toLowerCase();
        for (int i = 0; i <lowerStr.length(); i++) {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i'
                    || str.charAt(i)=='o' || str.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println(count);
    }

    static boolean lengthOfStringIsMultipleOfNumber(String str,int num){
        if (str.length()%num==0){
            return true;
        }
        return false;
    }

    static void alternateElements(String str){
        for (int i = 0; i < str.length(); i+=2) {
            System.out.print(str.charAt(i));
        }
    }

    //________________________14 june 2022_____________________________

    static String inbuiltSortString(String str){
        char[]arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    static String bubbleSortString(String str){
        char[]arr = str.toCharArray();
        
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    char temp = arr[i];
                    arr[i]=arr[j];
                    arr[j] = temp;
                }
            }
        }
       return new String(arr);
    }

    static String makeIdealString(String str){
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if(i==0){
                newStr = newStr + Character.toUpperCase(str.charAt(i));
            }else{
                newStr = newStr + Character.toLowerCase(str.charAt(i));
            }
        }

        return newStr;
    }

    static boolean isIdealString(String str){
        int n = str.length();
        if(n>0 && Character.isLowerCase(str.charAt(0)))
            return false;

        for (int i = 1; i < n; i++) {
            if(Character.isUpperCase(str.charAt(i)))
                return false;
        }
        return true;
    }

    static String makeWordsIdeal(String str){
        String []arr = str.split(" ");
        String newSent = "";

        for (int i = 0; i < arr.length; i++) {
             newSent = newSent + makeIdealString(arr[i])+ " ";
            }

        return newSent;
    }

    static String reverseAllWords(String str){
        String []arr = str.split(" ");
        String revSent = "";

        for (int i = 0; i < arr.length; i++) {
             revSent = revSent + reverseString(arr[i])+ " ";
        }

        return revSent;
    }

    static boolean isStringPalindrome(String str){
        String newStr = str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            if(newStr.charAt(i)!=newStr.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    static int integerEquivalent(String str){
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum = sum + str.charAt(i);
        }
        return sum;
    }

    static boolean isSumEqual(String str1,String str2){
        if(integerEquivalent(str1)!=integerEquivalent(str2)){
            return  false;
        }
        return true;
    }

    static void minMaxDiffOfVowelsIndices(String str){
        str = str.toLowerCase();
        int [] arr = new int[str.length()];
        int k =0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)== 'a' || str.charAt(i)== 'e'
                    || str.charAt(i)== 'i' || str.charAt(i)== 'o'
                    || str.charAt(i)== 'u'){
                arr[k]=i;
                k++;
            }
        }
        arr= Arrays.copyOf(arr,k);
        System.out.println(arr[arr.length-1]-arr[0]);

        int min = str.length()+1;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length-1; i++) {
            min = Math.min(min,arr[i+1]-arr[i]);
        }
        System.out.println(min);
    }

    static String rotateStringBy1(String str){
        char zero = str.charAt(0);
        String newStr = "";
        for (int i = 1; i < str.length(); i++) {
            newStr+=str.charAt(i);
        }
        newStr=newStr+zero;
        return newStr;
    }

    static boolean targetString(String str,String target){
        for(int i = 0; i<=str.length();i++){
            str = rotateStringBy1(str);
            System.out.println(str);
            if(str.equals(target)){
                return true;
            }
        }
        return false;
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
//        String a= sc.nextLine();
//        String b= sc.nextLine();
//        String str = "1234";
        int num = 23;
    }
}
