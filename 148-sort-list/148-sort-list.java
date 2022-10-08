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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode mid=findmid(head);
        ListNode left=head;
        ListNode right=mid.next;
        mid.next=null;
        
        ListNode part1=sortList(left);
        ListNode part2=sortList(right);
        
        ListNode result = mergetwoList(part1,part2);
        return result;
        
    }
    public ListNode findmid(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;   
    }
    public ListNode mergetwoList(ListNode head1,ListNode head2){
        if(head1==null)return head2;
        if(head2==null)return head1;
        
        ListNode t1=head1;
        ListNode t2=head2;
        ListNode head=null,tail=null;
        
        if(t1.val<=t2.val){
            head=t1;
            tail=t1;
            t1=t1.next;
        }else{
            head=t2;
            tail=t2;
            t2=t2.next;
        }
        
        while(t1!=null && t2!=null){
        if(t1.val<=t2.val){
            tail.next=t1;
            tail=t1;
            t1=t1.next;
        }else
        {
            tail.next=t2;
            tail=t2;
            t2=t2.next;
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