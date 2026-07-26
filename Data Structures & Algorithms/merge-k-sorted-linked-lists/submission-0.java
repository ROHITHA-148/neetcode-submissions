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
        ArrayList<Integer> finalArray=new ArrayList<>();
       
        for(int i=0;i<lists.length;i++){
            ListNode curr=lists[i];
            while(curr!=null){
            finalArray.add(curr.val);
            curr=curr.next;
            }
        }

      if(finalArray.size()==0){
            return null;
        }
        Collections.sort(finalArray);
       
       
        ListNode res=new ListNode(finalArray.get(0));
        ListNode dummy=res;
        for(int i=1;i<finalArray.size();i++){
           ListNode curr= new ListNode(finalArray.get(i));
            dummy.next=curr;
            curr.next=null;
            dummy=curr;
        }

        return res;


    }
}
