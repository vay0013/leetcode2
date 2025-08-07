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
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode();
        ListNode even = new ListNode();
        ListNode oddP = odd;
        ListNode evenP = even;
        ListNode cur = head;
        int l = 0;
        while (cur != null) {
            if (l % 2 == 0) {
                evenP.next = new ListNode(cur.val);
                evenP = evenP.next;
            } else {
                oddP.next = new ListNode(cur.val);
                oddP = oddP.next;
            }
            cur = cur.next;
            l++;
        }
        evenP.next = odd.next;
        return even.next;
    }
}