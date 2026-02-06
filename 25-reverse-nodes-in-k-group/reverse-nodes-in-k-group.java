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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        int count=0;

        // check if k nodes exist
        while(count<k)
        {
            if(temp==null)return head;
            temp=temp.next;
            count++;
        }
        // recursively call for rest of LL
        ListNode prev=reverseKGroup(temp,k);
        // reverse current group
        temp=head;
        // reverse current group
        count=0;
        while(count<k){
            ListNode  Next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=Next;
            count++;
        }
        return prev;
    }
}