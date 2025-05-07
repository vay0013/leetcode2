class Solution:
    def canVisitAllRooms(self, rooms: List[List[int]]) -> bool:
        seen = {0}
        stack = [0]
        while stack:
            node = stack.pop()
            for nb in rooms[node]:
                if nb not in seen:
                    seen.add(nb)
                    stack.append(nb)
        return len(seen) == len(rooms)
