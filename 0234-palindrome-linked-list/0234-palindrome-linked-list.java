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
        if(head == null && head.next == null ){
            return false;
        }

        ListNode start = head;
        ListNode end = head;

        while(end!=null && end.next!=null){
            start =start.next;
            end = end.next.next;
        }

        ListNode prev = null;
        ListNode curr = start;

        while(curr!=null){
            ListNode nextNode = curr.next;

            curr.next = prev;

            prev = curr;
            curr = nextNode;
        }
        ListNode first = head;
        ListNode second = prev;

        while (second != null) {

            if (first.val != second.val) {
                return false;
            }

            first = first.next;
            second = second.next;
        }

        return true;



    }
}