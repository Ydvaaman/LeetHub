//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class GFG{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            new Solution().rearrangeEvenOdd(head);
            printList(head); 
            t--;
        }
    } 
} 

// } Driver Code Ends


/*

class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
This is method only submission.
You only need to complete the below method.
*/
class Solution
{
  
    Node func(Node head)
    {
          Node oddHead=null,oddTail=null,evenHead=null,evenTail=null;
          int count =1;
          while(head!=null){
              if(count%2==0){
                  if(evenHead==null){
                      evenHead=head;
                      evenTail=head;
                      head=head.next;
                  }else{
                      evenTail.next=head;
                      evenTail=evenTail.next;
                      head=head.next;
                  }
              }else{
                    if(oddHead==null){
                      oddHead=head;
                      oddTail=head;
                      head=head.next;
                  }else{
                      oddTail.next=head;
                      oddTail=oddTail.next;
                      head=head.next;
                  }
              }
              count++;
          }
          if(oddHead==null)return evenHead;
          if(evenHead==null)return oddHead;
          
          evenTail.next=null;
          oddTail.next=evenHead;
          return oddHead;
     }
       void rearrangeEvenOdd(Node head){
        func(head);
    }
}
