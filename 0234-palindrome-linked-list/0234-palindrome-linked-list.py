# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        def find_mid(node):
            fast = node
            slow = node
            while fast and fast.next:
                fast = fast.next.next
                slow = slow.next
            return slow
        mid = find_mid(head)
        def reverse(node):
            prev = None
            cur = node
            while cur:
                next = cur.next
                cur.next = prev
                prev = cur
                cur = next
            return prev
        reversed_node = reverse(mid)
        while reversed_node:
            if reversed_node.val != head.val:
                return False
            reversed_node = reversed_node.next
            head = head.next
        return True