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
        ListNode even =new ListNode(0);
         ListNode odd =new ListNode(-1);
          ListNode evenTemp=even;
         ListNode oddTemp=odd;
         ListNode temp=head;
         while(temp!=null)
         {
            oddTemp.next=temp;
            temp=temp.next;
            oddTemp=oddTemp.next;

             evenTemp.next=temp;
             if(temp==null) break;
            temp=temp.next;
            evenTemp=evenTemp.next;
         }
         even=even.next;
         oddTemp.next=even;
         return odd.next;
    }
}