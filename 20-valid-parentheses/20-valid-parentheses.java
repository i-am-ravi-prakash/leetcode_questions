class Solution {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int len = s.length();

        for (int i = 0; i < len; i++) {
            char currChar = s.charAt(i);
            if (currChar == '(' || currChar == '{' || currChar == '[') {
                stack.push(currChar);
                continue;
            }
            if (stack.isEmpty()) return false;

            char topChar = stack.pop();

            if (currChar == ')' && (topChar == '{' || topChar == '[')) {
                return false;
            } else if (currChar == '}' && (topChar == '(' || topChar == '[')) {
                return false;
            } else if (currChar == ']' && (topChar == '(' || topChar == '{')) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
