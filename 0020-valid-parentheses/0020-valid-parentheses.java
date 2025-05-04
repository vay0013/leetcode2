class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if ((c == ')' || c == '}' || c == ']') && !stack.isEmpty()) {
                if (map.get(stack.peek()) == c) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }

        }
        return stack.isEmpty();
    }
}