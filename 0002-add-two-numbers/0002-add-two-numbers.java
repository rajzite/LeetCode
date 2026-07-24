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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode l3 = dummy;
        int carry = 0;
        while (l1 != null && l2 != null) {
            int num = l1.val + l2.val +carry;
            if (num > 9) {
                carry = 1;
                num %= 10;
            } else {
                carry = 0;
            }
            l3.next = new ListNode(num);
            l1 = l1.next;
            l2 = l2.next;
            l3 = l3.next;
        }

        ListNode remaining = (l1!=null) ? l1 : l2;
        while (remaining != null){
            int num = remaining.val +carry;
            if (num > 9) {
                carry = 1;
                num %= 10;
            } else {
                carry = 0;
            }
            l3.next = new ListNode(num);
            remaining = remaining.next;
            l3 = l3.next;
        }

        if (carry == 1){
            l3.next = new ListNode(carry);
        }

        return dummy.next;
    }
}