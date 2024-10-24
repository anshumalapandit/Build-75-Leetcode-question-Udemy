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
// iterative approach T.C=> 0(n) S.C=> 0(1) 
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head; 
        }
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            // next pointer to track
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            
        }
        return prev;
    }
}
// recursive apporach T.C => 0(n) S.C=> 0(n) = for recursively call stack

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head; 
        }
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            // next pointer to track
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            
        }
        return prev;
    }
}
