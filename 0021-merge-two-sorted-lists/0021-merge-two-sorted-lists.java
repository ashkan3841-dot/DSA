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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // ListNode dummy = new ListNode(-1);

        // ListNode curr = dummy;

        // while(list1!=null && list2!=null){
        //     if(list1.val<=list2.val){
        //         curr.next=list1;
        //         list1=list1.next;
        //     }else{
        //         curr.next=list2;
        //         list2=list2.next;
        //     }
        //     curr=curr.next;
        // }
        // if(list1 == null){
        //     curr.next = list2;

        // }else if(list2==null){

        //     curr.next=list1;
        // }
        // return dummy.next;

          ListNode temp1=list1;
          ListNode temp2=list2;
          ListNode head= new ListNode(100);
          ListNode temp = head;

          

          while(temp1!=null && temp2!=null ){
            if(temp1.val<temp2.val){
                ListNode a=new ListNode(temp1.val);
                temp.next=a;
                temp=a;
                temp1=temp1.next;

            }else{
                ListNode a=new ListNode(temp2.val);
                temp.next=a;
                temp=a;
                temp2=temp2.next;

            }
          }if(temp1==null){
            temp.next=temp2;
          }else{
            temp.next=temp1;
          }
          return head.next;
        
        
    }
}