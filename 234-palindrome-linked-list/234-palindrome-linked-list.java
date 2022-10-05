/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)return true;
        ListNode mid = middle(head);
        ListNode rev = reverse(mid);
        while(rev!=null){
            if(head.val!=rev.val){
                return false;
            }
            head=head.next;
            rev=rev.next;
            
        }
        return true;
        
    }
    public static ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
        
    }
    public static ListNode reverse (ListNode head){
        if(head==null)return head;
        ListNode prev=null;
        while(head!=null){
            ListNode temp = head.next;
            head.next=prev;
            prev=head;
            head=temp;
        }
        return prev;
    }
}