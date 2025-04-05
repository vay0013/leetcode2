# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        dummy = ListNode(-999)
        cur = dummy
        min_heap = []
        for i in range(len(lists)):
            if lists[i]:
                heappush(min_heap, (lists[i].val, i))
        while min_heap:
            _, i = heappop(min_heap)
            cur.next = lists[i]
            lists[i] = lists[i].next
            cur = cur.next
            if lists[i]:
                heappush(min_heap, (lists[i].val, i))
        return dummy.next