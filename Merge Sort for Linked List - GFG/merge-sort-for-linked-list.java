//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new Solution().mergeSort(head);
		     printList(head);
		    System.out.println();
        }
    }
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}



// } Driver Code Ends


//User function Template for Java
/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        this.data = key;
        next = null;
    }
} */

class Solution
{
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head)
    {
        if(head==null || head.next==null)return head;
        
        Node mid = findmid(head);
        Node left = head;
        Node right = mid.next;
        mid.next=null;
        
        Node part1=mergeSort(left);
        Node part2=mergeSort(right);
        
        Node result = mergeTwoList(part1,part2);
        return result;
        
        
    }
     static Node findmid(Node head)
    {
        if(head == null) return head;
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
     static Node mergeTwoList(Node head1,Node head2)
    {
        if(head1==null) return head2;
        if(head2==null) return head1;
        
        Node t1 = head1;
        Node t2 = head2;
        Node head = null , tail = null;
        
        if(t1.data<=t2.data){
            head = t1;
            tail = t1;
            t1=t1.next;
        }else{
            head=t2;
            tail=t2;
            t2=t2.next;
        }
        while(t1!=null && t2!=null){
            if(t1.data<=t2.data){
                tail.next=t1;
                tail=t1;
                t1=tail.next;
            }else{
                tail.next=t2;
                tail=t2;
                t2=tail.next;
            }
            
        }
        if(t1!=null){
            tail.next=t1;
        }else{
            tail.next=t2;
        }
        return head;
    }
}


