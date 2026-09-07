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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n==0) return head;
        ListNode fast =  head;
        ListNode slow =  new ListNode(0, head);
        ListNode dummy = slow;
        while(n!=0){
            fast = fast.next;
            n--;
        }
        while(fast!=null){
            slow = slow.next;
            fast=  fast.next;
        }
        ListNode tmp  = slow.next.next;
        slow.next.next =  null;
        slow.next=tmp;

        return dummy.next;


    }
}
