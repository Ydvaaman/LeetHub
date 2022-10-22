//{ Driver Code Starts
import java.util.*;

class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}



public class linkedlist {

    Node head;
    public void addToTheLast(Node node) {

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = node;
        }
    }
 public static void main(String args[]) {

        int value;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            linkedlist llist = new linkedlist();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);
                    
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }	
            Solution ob=new Solution();
            ob.display(llist.head);
        System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


/* Node is defined as
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution
{
    void display(Node head)
    {
        // if(head==null)return;
        // System.out.print(head.data+" ");
        // display(head.next);
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
}
