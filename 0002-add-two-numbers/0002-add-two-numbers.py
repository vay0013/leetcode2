# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        extra = 0
        dummy = ListNode(0)
        cur = dummy
        while l1 or l2 or extra != 0:
            ans = extra
            if l1:
                ans += l1.val
                l1 = l1.next
            if l2:
                ans += l2.val
                l2 = l2.next
            cur.next = ListNode(ans%10)
            cur = cur.next
            extra = ans//10
        return dummy.next