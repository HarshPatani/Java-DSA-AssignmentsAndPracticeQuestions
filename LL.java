package com.javaCodePractice;

class Node {
    int val;
    Node next;

    Node(int data) {
        this.val = data;
        this.next = null;
    }
}
public class LL {

     Node head;

    LL(){
        this.head = null;
    }


    void print(){
        Node cur = this.head;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }
    int length(){
        Node cur = this.head;
        int len =0;
        while(cur!=null){
            len++;
            cur=cur.next;
        }
        return len;
    }
    Node middle(){
        Node cur = this.head;
        int len = this.length();
        int mid = len/2;
        int pos = 0;
        while(pos!=mid){
            cur=cur.next;
            pos++;
        }
        return cur;
    }
    // FAST and SLOW Pointers method
    Node middle2() {
        Node slow = this.head;
        Node fast = this.head;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    // 1 2 3 4 5 6
    int getNthFromLast(Node head,int n){
        Node cur = head;
        int len =0;
        while(cur!=null){
            len++;
            cur=cur.next;
        }
        cur = head;
        for (int i = 0; i < len-n ; i++) {
            cur= cur.next;
        }
        return cur.val;

    }



    public static void main(String[] args) {




    }
}