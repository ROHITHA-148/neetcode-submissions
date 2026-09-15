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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)-> Integer.compare(a.val,b.val));
        ListNode dummy= new ListNode(0);
           for(int i=0;i<lists.length;i++){
            if(lists[i]!=null){
                pq.offer(lists[i]);
           }
           }
           ListNode prev=dummy;
           while(!pq.isEmpty()){
             ListNode curr=pq.poll();
             prev.next=curr;
             if(curr.next!=null){
             pq.offer(curr.next);
             }
             prev=curr;
           }
           return dummy.next;
    }
}
