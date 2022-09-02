package com.javaCodePractice;

import java.util.Locale;
import java.util.Scanner;
import java.util.*;

public class Practice {
    static void print2dArray(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
        }
    }

    static void matrixSort(int [][]arr){
        int m = arr.length;
        int n = arr[0].length;
        int[]brr= new int [m*n];
        int k =0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                brr[k++]=arr[i][j];
            }
        }
        Arrays.sort(brr);
        k=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=brr[k++];
            }
        }
        print2dArray(arr);

    }
    static String isPerfectSquare(double num){
        double squareRoot = Math.sqrt(num);
        if((squareRoot-Math.floor(squareRoot))==0){
            return "True";
        }
        return "False";
    }
    static void convert1dTo2dArray(int []arr,int rows,int cols){
        int size = arr.length;
        int k =0;
        if(rows*cols==size){
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols ; j++) {
                    System.out.print(arr[k]+" ");
                    k++;
                }
                System.out.println();
            }
        }
        
    }
    static boolean isPalindrome(int []arr){
        int size = arr.length;
        for (int i = 0; i < size/2; i++) {
            if(arr[i]!=arr[size-1-i]){
                return false;
            }
        }
        return true;
    }
    static int countPalindromeRows(int [][]arr){
        int rows = arr.length;
        int count = 0;
        for (int i = 0; i < rows; i++) {
            if(isPalindrome(arr[i])){
                count++;
            }
        }
        return count;
    }

    static void isSubSequence(String str, String target){
        int n = str.length();
        int m = target.length();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (str.charAt(i) == target.charAt(j))
                i++;
            j++;
        }
        if(i == n){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
    static boolean isPythagorasTriplet(int c){
        for(int a=0;a*a<=c;a++)
        {
            for(int b=0;b*b<=c;b++)
            {
                if(a*a+b*b==c)
                {
                    return true;
                }
            }
        }
        return false;
    }
    static void indicesMaxFreq(String str){
        int[] count = new int[26];
        for(int i=0; i<str.length(); i++){
            count[str.charAt(i)-'a']++;
        }
        int maxFrequency = count[0];
        char maxChar = 'a';

        for(int i=1; i<26; i++){
            if(count[i] > maxFrequency){
                maxFrequency = count[i];
                maxChar = (char)(i+'a');
            }
        }
        for(int i=0; i<str.length(); i++){
            if(maxChar == str.charAt(i)){
                System.out.print(i+1+" ");
            }
        }
    }
    static void sumOfAbsoluteDiff(int[] arr){
        int n = arr.length;
        int []brr = new int[n];
        int k =0;
        for (int i = 0; i < n; i++) {
            int temp=0;
            for (int j = 0; j < n; j++) {
                temp += Math.abs(arr[i]-arr[j]);
            }
            brr[k++]=temp;
        }
        printArray(brr);
    }
    static void subStrings(String str){
        int n=str.length();
        for (int i = 0; i < n; i++) {
            String ch = "";
            for (int j = i; j < n; j++) {
                ch+=str.charAt(j);
                System.out.print(ch+" ");
            }
        }
    }
    static String targetString(String str,String target){
        int n=str.length();
        int m = target.length();
        if(m!=n){
            return "False";
        }else{
            for (int i = 0; i < n; i++) {
                String ch = "";
                for (int j = 1; j < n; j++) {
                    ch+=str.charAt(j);
                }
                ch+=str.charAt(0);
                if(ch.equals(target)){
                    return "True";
                }
                str=ch;
            }
        }
        return "False";
    }
    static void rotateBy90(int[][]arr){
        int m = arr.length;

        int [][]brr= new int [m][m];
        int k=0;
        for (int i = 0; i < m; i++) {
            for (int j = m-1; j >= 0; j--) {
                brr[i][k]=arr[j][i];
                k++;
            }
            k=0;
        }
        print2dArray(brr);
    }
    static void zerosAtRight(int[]arr){
        int n = arr.length;
        int k=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]!=0){
                arr[k]=arr[i];
                k++;
            }
        }
        for (int i = k; i < n; i++) {
            arr[i]=0;
        }
        printArray(arr);
    }
    static boolean uniqueString(String str){
        for (int i = 0; i+1 < str.length(); i++) {
            if(str.charAt(0)!=str.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
    static void powerOfString(String str){
        int n=str.length();
        int max=0;
        for (int i = 0; i < n; i++) {
            String ch = "";
            for (int j = i; j < n; j++) {
                ch+=str.charAt(j);
                if(uniqueString(ch)){
                    if(max<ch.length()){
                        max=ch.length();
                    }
                }
            }
        }
        System.out.println(max);
    }
    static void reverseString(String str){
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }
    }

    static void vowelCount(String str){
        str =str.toLowerCase();
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i'
                    || str.charAt(i)=='o' || str.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
    static String isPalindrome(String str){
        str =str.toLowerCase();
        int i=0;
        for (i = 0; i < str.length(); i++) {
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return "Not a Palindrome";
            }
        }
        return "Palindrome";
    }
    static String isAnagram(String str,String target){
        if(str.length()==target.length()) {
            int[]arr = new int [256];
            int[]brr = new int [256];
            for (int i = 0; i < str.length(); i++) {
                int ind = str.charAt(i);
                arr[ind]++;
            }
            for (int i = 0; i < target.length(); i++) {
                int ind = target.charAt(i);
                brr[ind]++;
            }
            for (int i = 0; i < 255; i++) {
                if(arr[i]!=brr[i]){
                    return "False";
                }
            }
        }else{
            return "False";
        }
        return "True";
    }
    static void revSentence(String str){
        String []arr = str.split(" ");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
    static void sumOfSubstrings(String str){
        int n=str.length();
        int sum=0;
        for (int i = 0; i < n; i++) {
            String ch = "";
            for (int j = i; j < n; j++) {
                ch+=str.charAt(j);
                sum+=Integer.parseInt(ch);
                System.out.println(sum);
            }
        }
        System.out.println(sum);
    }
    static int[] twoSum(int[] arr, int n, int target){
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]+arr[j]==target){
                        return new int[] {i,j};
                }
            }
        }
        return new int[]{-1 , -1};
    }
    static int maxDiff(int arr[]){
        int n = arr.length;
        int max_diff = arr[1] - arr[0];

        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                if (arr[j] - arr[i] > max_diff)
                    max_diff = arr[j] - arr[i];
            }
        }
        if(max_diff>0)
            return max_diff;
        else
            return -1;
    }
    static String longestCommonPrefix(String str1, String str2){
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        int n = Math.min(str1.length(), str2.length());

        StringBuilder longest= new StringBuilder();
        for (int i = 0; i < n; i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                break;
            }else{
                longest.append(str1.charAt(i));
            }
        }
        if(longest.toString().equals(""))
            return "-1";
        return longest.toString();
    }

    static String gcd(int a, int b,int target){
        int result = Math.min(a, b); // Find Minimum of a nd b
        while (result > 0) {
            if (a % result == 0 && b % result == 0){
                break;
            }
            result--;
        }
        if(target>result)
            return "True";
        return "False"; //returning true false according to the given question
    }

    static void twoSumArrays(int[] arr, int []brr,int targetSum){
        int n = arr.length;
        int m = brr.length;
        int one = 0;
        int two = 0;
        int diff = Integer.MAX_VALUE;
        int i =0, j = m-1;
        while(i<n && j>=0){
            if(Math.abs(targetSum-(arr[i]+brr[j]))<diff) {
                one = i;
                two = j;
                diff=Math.abs(targetSum-(arr[i]+brr[j]));
            }

            if(arr[i]+brr[j]>targetSum)
                j--;
            else
                i++;
        }
        System.out.println(arr[one]+" "+brr[two]);
    }
    static void subStringsWithNoVowels(String str){
        str=str.toLowerCase();
        int n=str.length();

        int count=0;
        for (int i = 0; i < n; i++) {
            String ch = "";
            for (int j = i; j < n; j++) {
                ch+=str.charAt(j);
                System.out.print(ch+" ");
                boolean flag= true;
                for (int k = 0; k < ch.length(); k++) {//h ha har hars harsh a ar ars arsh r rs rsh s sh h
                    if(ch.charAt(k)=='a' || ch.charAt(k)=='e' || ch.charAt(k)=='i'
                            ||  ch.charAt(k)=='o' || ch.charAt(k)=='u')
                    {
                        flag= false;
                    }
                }
                if(flag){
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println(count);
    }
    static char[] removeDuplicateChar(String str){
        int n=str.length();
        int [] arr = new int [255];
        for (int i = 0; i < str.length(); i++) {
            if(arr[str.charAt(i)]==0){
                arr[str.charAt(i)]++;
            }
        }
        char [] chars= new char[str.length()];
        int ind = 0;
        for (int i = 0; i < 255; i++) {
            if(arr[i]!=0){
                chars[ind]=(char) i;
                ind++;
            }
        }
       return Arrays.copyOfRange(chars,0,ind);

    }
    static String removeDuplicate(String s){
        char []str = s.toCharArray();
        int n = str.length;

        int index = 0;


        for (int i = 0; i < n; i++){
            int j;
            for (j = 0; j < i; j++)
            {
                if (str[i] == str[j])//aaj
                {
                    break;
                }
            }

            if (j == i)
            {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }

    static int locateTargetString(String str,String t){
        str=str.toLowerCase();
        int n=str.length();
        int count=0;
        if(t.length()>str.length()){
            return -1;
        }else {
            for (int i = 0; i < n; i++) {
                String ch = "";
                for (int j = i; j < n; j++) {
                    ch += str.charAt(j);
                    if (ch.equals(t)) {
                        return  i;
                    }
                }
            }
        }
        return -1;
    }
    static String isIsogram(String str){
        int arr []= new int [26];
        for (int i = 0; i < str.length(); i++) {
            int ind = str.charAt(i)-97;
            arr[ind]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>1){
                return "Not an Isogram";
            }
        }
        return "Isogram";
    }
    static String isPangram(String str){
        int arr []= new int [26];
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!=' '){
                int ind = str.charAt(i)-97;
                if(ind>-1 && ind <26 ){
                    arr[ind]++;
                }else
                    return "NO";
            }
        }
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 1) {
                return "NO";
            }

        }
        return "YES";
    }
    static String firstNonRepeating(String str) {
        int arr[] = new int[256];
        for (int i = 0; i < str.length(); i++) {
            int ind = str.charAt(i);
            arr[ind]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if(arr[str.charAt(i)]==1){
                return String.valueOf(str.charAt(i));
            }
        }
        return "-1";
    }
    static String  balancedString(String str) {
        int mid = str.length()/2;
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i <=mid ; i++) {
            rightSum+=Integer.parseInt(String.valueOf(str.charAt(i)));
            leftSum+=Integer.parseInt(String.valueOf(str.charAt(str.length()-1-i)));
            }

        if(leftSum==rightSum)
            return "YES";
        return "NO";
    }
    static String  asciiSum(String str,String target) {
        int strSum = 0;
        int targetSum = 0;
        for (int i = 0; i <str.length() ; i++) {
            strSum+=str.charAt(i);
        }
        for (int i = 0; i <target.length() ; i++) {
            targetSum+=target.charAt(i);
        }

        if(strSum==targetSum)
            return "YES";
        return "NO";
    }
    static String saveThePuppy(int find,int reachGate, int []arr) {
        int n =arr.length;
        for (int i = 0; i < n; i++) {
            if((find+reachGate)<=arr[i]){
                return "YES";
            }
        }
        return "NO";
    }

    static void addOne(int arr[]) {
        int n = arr.length;
        int []brr = new int[n+1];
        int carry =1;
        for (int i = arr.length-1; i >=0 ; i++) {
                if(arr[i]+carry<=9){
                    arr[i]++;
                    carry=0;
                    break;
                }else
                    arr[i]=0;
                    carry=1;
        }
    }
    static void sineWavePrint(int [][]arr){
        int rows = arr.length;
        int cols = arr[0].length;
        for(int i =0; i<cols ; i++){
            for(int j =0; j<rows ;j++){
                if(i%2==0){
                    System.out.print(arr[j][i]+" ");
                }else
                    System.out.print(arr[rows-j-1][i]+" ");
            }
        }
    }

    static boolean checkRedundancy(String s) {
        Stack<Character> st = new Stack<>();
        char[] str = s.toCharArray();
        for (char ch : str) {

            if (ch == ')') {
                char top = st.peek();
                st.pop();
                boolean flag = true;    //((a+b))

                while (top != '(') {
                    if (top == '+' || top == '-'
                            || top == '*' || top == '/') {
                        flag = false;
                    }
                    top = st.peek();
                    st.pop();
                }

                if (flag == true) {
                    return true;
                }
            } else {
                st.push(ch);
            }
        }
        return false;
    }

    static void kthAbsoluteDiff(int []arr,int k) {
       int result= Math.abs(Collections.findKthLargest(arr,k)-Collections.findKthSmallest(arr,k));
        System.out.println(result);
    }

    static void intersectionOf2Arrays(int []arr,int []brr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < brr.length; j++) {
                if(arr[i]==brr[j]){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }

    static void mostFrequentCharInLexicographicOrder(String s) {
        int []arr = new int [256];
        for(int i =0;i<s.length();i++){
            int ind = s.charAt(i);
            arr[ind]++;
        }
        int maxFreq = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>maxFreq){
                maxFreq=arr[i];
            }
        }
        int lex = Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==maxFreq){
                if((char)i<lex){
                    lex= (char) i;
                }
            }
        }
        char mostFreq = (char)lex;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==mostFreq)
                System.out.print(i+1+" ");
        }
    }
    static void heightOfTriangle(int base,int area) {
        double height = Math.ceil(((double)area *2)/(double)base);
        System.out.println((int) height);
    }

    static int reverse(int x) {

        long ans=0;
        while(x!=0){
            int rem = x%10;
            ans=ans*10+rem;
            x = x/10;
        }
        if(ans>Math.pow(2,31)-1 || ans<Math.pow(-2,31))
            return 0;

        return (int)ans;

    }
    static int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer> ();
        for (int i = 0; i < nums.length; i++) {
            if(hm.containsKey(nums[i])){
                continue;
            }else{
                hm.put(nums[i],1);
            }
        }
        return hm.size();
    }
    static int remove_duplicate(int a[],int n){
        int i=0;
        for(int j=1;j<n;j++){
            if(a[i]!=a[j])
                i++;
            a[i] = a[j];
        }
        return i+1;
    }

    static int subSequence(String haystack,String needle) {
        int j =0;
        int n = needle.length();
        int h = haystack.length();
        if(n>h){
            return -1;
        }else if(n==0)
            return 0;
        else{
            for (int i = 0; i < h; i++) {

                    if(needle.charAt(j)==haystack.charAt(i)) {
                         // 0 1 2 3 4 5
                        j++;
                    }if(j==n){
                        return i-n+1;
                    }else {
                    i = i - j;
                    j = 0;
                    }

            }
        }
        return -1;
    }
    static void positiveAndNegative(int []arr){
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            int temp= arr[i];
            if (arr[i]>0){    //  i0 j-1 i1 j0
                int j = i-1;
                while(j>=0 && arr[j]<=0){
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+1]=temp;
            }
        }
        printArray(arr);
    }
    /// TWO POINTER APPROACH
    static void positiveAndNegative2(int []arr){
        int i = 0;
        int j = arr.length-1;
       while(i<j){
           if(arr[i]<0){
               int temp = arr[i];
               arr[i]= arr[j];
               arr[j]=temp;
               j--;
           }else
               i++;
       }
        printArray(arr);
    }
    static int factorial(int a){
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact *i;
        }
        return fact;
    }
    static int recursiveFactorial(int n){
        if(n==1)
            return 1;
        else
           return  n * recursiveFactorial(n-1);
    }
    static int factorialSum(int n){
        int sum =0;
        while (n!=0){
            int rem = n%10;
            int fact = factorial(rem);
            sum= sum+fact;
            n=n/10;
        }
        return sum;
    }
    static int wordOccurrences(String str,String query){
        String [] arr =str.split("_");
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if(Objects.equals(arr[i], query))
                count++;
        }
        return count;
    }
    static int power(int a,int b){
        int pow = 1;
        for (int i = 0; i < b; i++) {
            pow=pow*a;
        }
        return pow;
    }

    static String reverse(String word){
        char ch;
        String reverseWord = "";

        for (int i=0; i<word.length(); i++)
        {
            ch= word.charAt(i); //extracts each character
            reverseWord= ch + reverseWord; //adds each character in front of the existing string
        }
        return reverseWord;
    }
    static String stringFormation(String s,int q){
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i < q; i++) {
            int t = sc.nextInt();
            if(t==1){
                s=reverse(s);

            }else if(t==2){
                int f = sc.nextInt();
                char c = sc.nextLine().charAt(1);
                if(f==1){
                    s=c+s;
                }else if(f==2){
                    s=s+c;
                }
            }
        }
        return s;
    }
    static void maxProdOf3Nums(int [] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int prod=0;
        for (int i = 0; i < n - 2; i++)
            for (int j = i + 1; j < n - 1; j++)
                for (int k = j + 1; k < n; k++)
                    max = Math.max(max, arr[i] * arr[j] * arr[k]);
        System.out.println(prod);
    }
    static int equilibriumPoint(int [] arr){
        int n = arr.length;
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < n; i++){
            sumLeft = 0;
            for (int j = 0 ; j < i; j++) {
                sumLeft += arr[j];
            }
            sumRight = 0;
            for (int j = i+1 ; j < arr.length; j++) {
                sumRight += arr[j];
            }
            if(sumLeft==sumRight){
                return i+1;
            }
        }
        return -1;
    }
    static void halfAscendingHalfDescending(int [] arr){
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        int [] brr= new int [n];
        int mid = n/2;

        for (int i = 0; i < mid; i++) {
            brr[i]=arr[i];
        }
        int i=arr.length-1, j =mid;
        while (i>=mid && j<arr.length){
            brr[j]=arr[i];
            i--;j++;
        }
        printArray(brr);
    }
    static void framePattern(int n){

        for (int i = 0; i < (n/2)+1; i++) {
            for (int j = 0; j < (n/2)+1-i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < (2*i)+1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (n/2)+1-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n/2; i >0; i--) {
            for (int j = 0; j < (n/2)+2-i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < (2*i)-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (n/2)+2-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        // Write your code here
        final Stack<Integer> st1 = new Stack<>();
        final Stack<Integer> st2 = new Stack<>();
        final Stack<Integer> st3 = new Stack<>();
        int st1TotalHeight = 0, st2TotalHeight = 0, st3TotalHeight = 0;

        for (int i = h1.size() - 1; i >= 0; i--) {
            st1TotalHeight += h1.get(i);
            st1.push(st1TotalHeight);
        }
        for (int i = h2.size() - 1; i >= 0; i--) {
            st2TotalHeight += h2.get(i);
            st2.push(st2TotalHeight);
        }
        for (int i = h3.size() - 1; i >= 0; i--) {
            st3TotalHeight += h3.get(i);
            st3.push(st3TotalHeight);
        }
        while (true) {
            if (st1.isEmpty() || st2.isEmpty() || st3.isEmpty())
                return 0;
            st1TotalHeight = st1.peek();
            st2TotalHeight = st2.peek();
            st3TotalHeight = st3.peek();
            if (st1TotalHeight == st2TotalHeight && st2TotalHeight == st3TotalHeight)
                return st1TotalHeight;
            else if (st1TotalHeight >= st2TotalHeight && st1TotalHeight >= st3TotalHeight)
                st1.pop();
            else if (st2TotalHeight >= st1TotalHeight && st2TotalHeight >= st3TotalHeight)
                st2.pop();
            else if (st3TotalHeight >= st2TotalHeight && st3TotalHeight >= st1TotalHeight)
                st3.pop();
        }

    }

     static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {

         final Stack<Integer> st1 = new Stack<>();
         final Stack<Integer> st2 = new Stack<>();

         for (int i = a.size() - 1; i >= 0; i--) {
             st1.push(a.get(i));
         }
         for (int i = b.size() - 1; i >= 0; i--) {
             st2.push(b.get(i));
         }

         int sum =0;
         int count =0;
         while(sum<=maxSum){

             if(st1.peek()<st2.peek())
                 sum+= st1.pop();
             else
                 sum+= st2.pop();
             if(sum<=maxSum)
                 count++;

         }
         return count;
    }


    static String hasCommonSubString(String s1,String s2){
        HashSet<Character> hm1 = new HashSet<Character>();
        HashSet<Character> hm2 = new HashSet<Character>();
        for (int i = 0; i < s1.length(); i++) {
            hm1.add(s1.charAt(i));
        }
        for (int i = 0; i < s2.length(); i++) {
            hm2.add(s2.charAt(i));
        }
        hm1.retainAll(hm2);
        if(!hm1.isEmpty())
            return "YES";
        return "NO";
    }

    


    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int [] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                arr[i]= sc.nextInt();
//            }
//        }
        String a = "hello";
        String b = "world";
        System.out.println(hasCommonSubString(a,b));
    }
}
