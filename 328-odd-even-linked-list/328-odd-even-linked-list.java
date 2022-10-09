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
    public ListNode oddEvenList(ListNode head) {
        ListNode oddHead=null,oddTail=null,evenHead=null,evenTail=null;
        int count = 1;
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
        if(evenHead==null)return oddHead;
        if(oddHead==null)return evenHead;
        
        evenTail.next=null;
        oddTail.next=evenHead;
        return oddHead;
        
    }
}