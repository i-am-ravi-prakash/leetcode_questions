class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        Stack<Character> stack = new Stack<>();
        boolean result = true;
        
        for(int i = 0; i < len; i++){
            char currChar = s.charAt(i);
            if(currChar == '(' || currChar == '{' || currChar == '['){
                stack.push(currChar);
                continue;
            }
            
            if(stack.isEmpty())
                return result = false;
            
            char topChar = stack.pop();
            
            if(currChar == ')' && (topChar == '{' || topChar == '[')){
                return false;
            }
            else if(currChar == '}' && (topChar == '(' || topChar == '[')){
                return false;
            }
            else if(currChar == ']' && (topChar == '(' || topChar == '{')){
                return false;
            }
        }
        
        return stack.isEmpty();
    }
}