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
        ListNode dummy = new ListNode(0, head);
        ListNode cur = dummy;
        int len = 0;
        ListNode fast = head;
        while (fast != null) {
            len++;
            fast = fast.next;
        }
        for (int i = 0; i < len-n; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return dummy.next;
    }
}