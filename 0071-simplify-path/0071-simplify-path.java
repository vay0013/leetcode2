class Solution {
    public String simplifyPath(String path) {
        Deque<String> q = new ArrayDeque<>();
        for (String c : path.split("/")) {
            if (c.equals("") || c.equals(".")) {
                continue;
            } else if (c.equals("..")) {
                if (!q.isEmpty()) {
                    q.pollLast();
                }
            } else {
                q.add(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!q.isEmpty()) {
            sb.append("/");
            sb.append(q.poll());
        }
        if (sb.length() == 0) {
            return "/";
        }
        return sb.toString();
    }
}