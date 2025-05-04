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
        ListNode res = new ListNode(0);
        ListNode cur = res;
        int extra = 0;
        while (l1 != null || l2 != null || extra != 0) {
            int sum = extra;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }   
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            extra = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
        }
        return res.next;
    }
}