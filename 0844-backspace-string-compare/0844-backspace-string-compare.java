class Solution {
    public boolean backspaceCompare(String S, String T) {
        return compute(S).equals(compute(T));
    }
    
     Stack<Character> compute(String S) {
        Stack<Character> stack = new Stack();
        for (char c : S.toCharArray()) {
            if (c != '#') {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        return stack;
    }
}