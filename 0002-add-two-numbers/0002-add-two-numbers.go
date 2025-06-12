/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
    dummy := &ListNode{Val: 0}
    cur := dummy
    extra := 0
    for l1 != nil || l2 != nil || extra != 0 {
        if l1 != nil {
            extra += l1.Val
            l1 = l1.Next
        }
        if l2 != nil {
            extra += l2.Val
            l2 = l2.Next
        }
        cur.Next = &ListNode{Val: extra % 10}
        cur = cur.Next
        extra = extra / 10

    }
    return dummy.Next
}