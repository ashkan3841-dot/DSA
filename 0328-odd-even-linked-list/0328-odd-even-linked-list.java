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
        // ListNode dummy1=new ListNode(0);
        // ListNode dummy2=new ListNode(1);
        // ListNode temp1=head;
        // ListNode temp2=dummy1;
        // ListNode temp3=dummy2;



        // int size=0;
        // while(temp1!=null){
        //     size++;
        //     temp1=temp1.next;
        // }
        // temp1=head;
        // for(int i=1;i<=size;i++){
        //     if(i%2!=0){
        //         ListNode a=new ListNode(temp1.val);
        //         temp2.next=a;
        //         temp2=temp2.next;
        //         temp1=temp1.next;            
        //     }
        //     else{
        //         ListNode b=new ListNode(temp1.val);
        //         temp3.next=b;
        //         temp3=temp3.next;
        //         temp1=temp1.next; 

        //     }
        // }
        // temp2.next=dummy2.next;
        // return dummy1.next;
        if(head==null || head.next==null){
            return head;
        }

        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenhead=even;

        while(even!=null && even.next!=null){
            odd.next=even.next;
            odd=even.next;
            even.next=odd.next;
            even=odd.next;
        }
        odd.next=evenhead;
        return head;


        
    }
}