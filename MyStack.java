package com.javaCodePractice;

import java.util.ArrayList;

public class MyStack {
    ArrayList<Integer> arr;
    int maxSize;

    MyStack(int maxSize){
        this.maxSize= maxSize;
        arr = new ArrayList<Integer>();
    }
    int peek(){
        if(arr.size()>0)
            return arr.get(arr.size()-1);
        return -1;
    }
    void push(int a){
        if(arr.size()<maxSize)
            arr.add(a);
        else System.out.println("stackOverflow");
    }
    int size(){
        return arr.size();
    }
    int pop(){
         return arr.remove(arr.size()-1);
    }
    void print(){
        for (int i = arr.size(); i >=0 ; i--) {
            System.out.print(arr.get(i)+" ");
        }
    }
}
class MyQueue{
    ArrayList<Integer> arr;
    MyQueue(){
        arr = new ArrayList<Integer>();
    }
    int peek(){
        if(arr.size()>0)
            return arr.get(0);
        return -1;
    }
    void push(int a){
        arr.add(a);
    }
    int size(){
        return arr.size();
    }
    int poll(){
        return arr.remove(0);
    }
    void print(){
        for (int i = arr.size(); i >=0 ; i--) {
            System.out.print(arr.get(i)+" ");
        }
    }
}