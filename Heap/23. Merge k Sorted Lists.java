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
        PriorityQueue<ListNode> minheap=new PriorityQueue<>(new Comparator<ListNode>(){
            @Override
            public int compare(ListNode node1,ListNode node2){
                return node1.val-node2.val;
            }
        });
        for(ListNode head:lists){
            if(head!=null){
                minheap.add(head);
            }
        }
        ListNode head=new ListNode(-1);
        ListNode cur=head;
        while(!minheap.isEmpty()){
            ListNode temp=minheap.poll();
            cur.next=temp;
            cur=cur.next;
            if(temp.next!=null){
                minheap.add(temp.next);
            }
        }
        return head.next;
    }
    // T.c 0(n*logk)  S.C=0(k)''
}
