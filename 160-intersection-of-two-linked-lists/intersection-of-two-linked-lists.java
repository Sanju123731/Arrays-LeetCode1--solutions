/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=headA;
        ListNode tempB=headB;
        // calculate the length of listnode A
        int lengthA=0;
        while(tempA!=null)
        {
            lengthA++;
            tempA=tempA.next;
        }
        tempA=headA;
        // calculate the length of listnode B
           int lengthB=0;
        while(tempB!=null)
        {
            lengthB++;
            tempB=tempB.next;
        }
          tempB=headB;
        // calculate the length gap
        if(lengthA>lengthB) {
            int steps=lengthA-lengthB;
            for(int i=1;i<=steps;i++)
            {
                tempA=tempA.next;
                 }
                 }
        else{
            int steps=lengthB-lengthA;
            for(int i=1;i<=steps;i++){
                tempB=tempB.next;
                }
                 }
        while(tempA!=null && tempB!=null){
            if(tempA==tempB)
            {
                return tempA;
            }
            tempA=tempA.next;
             tempB=tempB.next;
        }
        return null;  }}