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
        int extra = 0;
        ListNode res = new ListNode(0);
        ListNode cur = res;
        while (l1 != null || l2 != null || extra == 1) {
            int p1 = 0;
            int p2 = 0;
            if (l1 != null) {
                p1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                p2 = l2.val;
                l2 = l2.next;
            }
            cur.next = new ListNode((p1 + p2 + extra) % 10);
            cur = cur.next;
            extra = (p1 + p2 + extra) / 10;
        }
        return res.next;
    }
}