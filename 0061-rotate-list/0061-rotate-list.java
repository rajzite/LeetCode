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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode list = head;
        int count = 0;
        while (list!=null){
            count++;
            list = list.next;
        }
        k = k%count;
        while (k>0){
            ListNode ans = new ListNode(-1);
            ListNode dummy = head;
            while (dummy.next.next !=null){
                dummy = dummy.next;
            }
            int num = dummy.next.val;
            dummy.next = null;
            ans.next = new ListNode(num);
            ans = ans.next;
            ans.next = head;
            head = ans;
            k--;
        }

        return head;
    }
}