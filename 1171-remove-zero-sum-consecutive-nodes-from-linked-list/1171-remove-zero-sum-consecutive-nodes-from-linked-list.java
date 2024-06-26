
class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        int prefixSum = 0;
        HashMap<Integer,ListNode> map = new HashMap<>();
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        map.put(0,dummyNode);
        while(head!=null){
            prefixSum+=head.val;
            if(map.containsKey(prefixSum)){
                ListNode start = map.get(prefixSum);
                ListNode temp = start;
                int pSum = prefixSum;
                while(temp!=head){
                    temp = temp.next;
                    pSum+=temp.val;
                    if(temp!=head){
                        map.remove(pSum);
                    }
                    start.next = temp.next;
                }
                
            }else{
                map.put(prefixSum,head);
            }
            head = head.next;
        }
        return dummyNode.next;
    }
}