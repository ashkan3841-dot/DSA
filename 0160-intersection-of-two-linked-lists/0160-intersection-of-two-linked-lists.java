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

        int lenA=0;
        while(headA!=null){
            lenA++;
            headA=headA.next;

        }
        int lenB=0;
        while(headB!=null){
            lenB++;
            headB=headB.next;
        }

        if(lenA>lenB){
            int steps=lenA-lenB;
            for(int i=1;i<=steps;i++){
                tempA=tempA.next;
            }
        }else{
            int steps=lenB-lenA;
            for(int i=1;i<=steps;i++){
                tempB=tempB.next;
            }
            
        }
        while(tempA!=tempB){
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return tempA;
        

    }
}