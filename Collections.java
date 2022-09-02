package com.javaCodePractice;
import java.sql.SQLOutput;
import java.util.*;

public class Collections {
    static boolean isValid(String s){
        Stack<Character> st = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                st.push(s.charAt(i));
            else {
                if (st.empty())
                    return false;

                if (st.peek() == '(' && s.charAt(i) == ')')
                    st.pop();
                else if (st.peek() == '{' && s.charAt(i) == '}')
                    st.pop();
                else if (st.peek() == '[' && s.charAt(i) == ']')
                    st.pop();
                else
                    st.push(s.charAt(i));
            }
        }
        if (st.empty())
            return true;
        return false;
    }

    static boolean isValid2(String exp) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<exp.length();i++){
            if(exp.charAt(i)=='(' || exp.charAt(i)=='[' || exp.charAt(i)=='{')
                stack.push(exp.charAt(i));
            else if(exp.charAt(i)==')' || exp.charAt(i)==']' || exp.charAt(i)=='}'){
                if(stack.empty())
                    return false;
                Character alpha = stack.pop();
                if(alpha == '('){
                    if(exp.charAt(i) != ')')
                        return false;
                }
                if(alpha == '['){
                    if(exp.charAt(i) != ']')
                        return false;
                }
                if(alpha == '{'){
                    if(exp.charAt(i) != '}')
                        return false;
                }
            }
        }
        if(!stack.empty())
            return false;
        return true;
    }
    static void nextGreaterRight(int[] arr){
        for(int i=0;i<arr.length;i++){
            int ans = -1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    ans = arr[j];
                    break;
                }
            }
            System.out.print(ans+" ");
        }
    }

    static void nextGreaterRightStack(int[] arr){
        ArrayList<Integer> op = new ArrayList<Integer>();
        Stack<Integer> st = new Stack<Integer>();
        for(int i=arr.length-1;i>=0;i--){
            if(st.empty())
                op.add(-1);
            else if(st.peek()>arr[i])
                op.add(st.peek());
            else{
                while(st.size()>0 && st.peek()<arr[i]){
                    st.pop();
                }
                if(st.size()==0)
                    op.add(-1);
                else
                    op.add(st.peek());
            }
            st.push(arr[i]);
        }
        //Print reverse of op -> Answer
        System.out.println(op);
    }
    static void studentsAndSandwiches(int[] students,int[]sandwiches){
        Queue<Integer> queue = new LinkedList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();

        for (int k = 0; k < students.length; k++) {
            queue.add(students[k]);
            stack.push(sandwiches[sandwiches.length-1-k]);
        }
        int count=0;

        while(queue.size()>0 && count!=queue.size()){
            if(queue.peek()==stack.peek()){
                queue.remove();
                stack.pop();
                count=0;
            }else {
                queue.add(queue.peek());
                queue.remove();
                count++;
            }
        }
        System.out.println(count);
    }

    static int timeRequiredToBuy(int[] tickets, int k) {
        int time =0;
        while(true){
            for (int i = 0; i < tickets.length; i++) {
                if(tickets[i]>0){
                    tickets[i]=tickets[i]-1;
                    time++;
                }
                if(tickets[k]==0){
                    return time;
                }
            }
        }
    }

    static int findKthLargest(int[] nums, int k) {
            PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
            for(int i=0;i<nums.length;i++){
                pq.add(nums[i]);
                if(pq.size()>k){
                    pq.remove();
                }
            }
            return pq.peek();
    }

    static int findKthSmallest(int[] nums, int k) {
            PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
            for(int i=0;i<nums.length;i++){
                pq.add(nums[i]);
            }
        for (int i = 0; i < k-1; i++) {
            pq.remove();
        }
            return pq.peek();
    }
    static void count(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(hm.isEmpty()){
                hm.put(nums[i],1);
            }else if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }else
                hm.put(nums[i],1);
        }
        int max = Integer.MIN_VALUE;
        int element = -1;
        for(Map.Entry<Integer,Integer> e : hm.entrySet()){
            if(max<e.getValue()) {
                max = e.getValue();
                 element = e.getKey();
            }
        }
        System.out.println(element);
    }
    //Print hashmap
    //   for(Map.Entry<Integer,String> e : h.entrySet()){
    //   System.out.println(e.getKey()+" -> "+e.getValue());
    // }

     static List<Integer> getMax(List<String> operations) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = operations.size();
        Stack<Integer> mainStack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
        List<Integer> list= new ArrayList<Integer>();

        maxStack.push(Integer.MIN_VALUE);


        for(String o: operations){
            String []arr = o.split(" ");
            System.out.println(arr[0]);
                    switch (arr[0]) {
                        case "1":
                            int item = Integer.parseInt(arr[1]);
                            mainStack.push(item);
                            int maxSofar = maxStack.peek();
                            if(item > maxSofar)
                                maxStack.push(item);
                            else
                                maxStack.push(maxSofar);
                            break;
                        case "2":
                            mainStack.pop();
                            maxStack.pop();
                            break;
                        case "3":
                            System.out.println(maxStack.peek());
                            list.add(maxStack.peek());
                            break;
                    }
        }
        return list;
    }
    static String equalPairs(int []arr){
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

        for (int i:arr) {
            if(hm.isEmpty()){
                hm.put(i,1);
            }else if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }else
                hm.put(i,1);
        }
        for (Map.Entry<Integer,Integer> e: hm.entrySet()) {
            int value = e.getValue();
            if(value%2!=0){
                return "NO";
            }
        }
        return "YES";
    }
    static String stringsAndGames(String str){ // caaabccca
        if(str.length()==0)
            return "VANISHED";
        char [] chars = str.toCharArray();

        int k = 0;
        for (int i = 0; i < chars.length; i++) {
            if(i==0){
                if(chars[i]!=chars[i+1]){
                    chars[k++] = chars[i];
                }
                continue;
            }
            if(i==chars.length-1){
                if(chars[i]!=chars[i-1]){
                    chars[k++] = chars[i];
                }
                continue;
            }
            if (chars[i-1] != chars[i] && chars[i+1] != chars[i]){
                chars[k++] = chars[i];
            }
        }

        String s = new String(chars).substring(0,k);
        if(s.length()==0){
            System.out.println(s);
            return "VANISHED";
        }
        return s;
    }
    static String stringsAndGames1(String str){ // caaabccca
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        String result = "";
        if(str.length()==0)
            return "VANISHED";
        for (int i=0;i<str.length();i++) {
            char c = str.charAt(i);
            if(hm.isEmpty()){
                hm.put(c,1);
            }else if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }else
                hm.put(c,1);
        }
        for (Map.Entry<Character,Integer> e: hm.entrySet()) {
            int value = e.getValue();
            if(value==1){
                result+=e.getKey();
            }
        }
        if (result.length()==0)
            return "VANISHED";
        return result;
    }
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
    static void medalDistribution(int[] arr){
        int n = arr.length;
        int[]brr = Arrays.copyOf(arr,n);

        HashMap<Integer,String> hm = new HashMap<Integer,String>();

        bubbleSort(brr);

        hm.put(brr[0],"Gold");
        hm.put(brr[1],"Silver");
        hm.put(brr[2],"Bronze");
        for (int i = 3; i < brr.length; i++) {
            hm.put(brr[i],Integer.toString(i));
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(hm.get(arr[i])+" ");
        }
    }


    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String n = sc.next();
//        int[]arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        medalDistribution(arr);
    }
}
