// https://leetcode.com/problems/odd-even-linked-list/
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
  // Two pointer approach
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        
        ListNode odd = head;
        ListNode h_odd = head;
        ListNode even = head.next;
        ListNode h_even = head.next;
        
        while(even != null) {
            if(even.next == null) {
                odd.next = h_even;
                return h_odd;
            }
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even= even.next;
        }
        odd.next = h_even;
        
        return h_odd;
    }
}
