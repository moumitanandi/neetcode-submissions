class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 == 1) return false;

        Stack<Character> pStack = new Stack<>();

        for(char c: s.toCharArray()) {
            if(c == '(') {
                pStack.push(')');
            }
            else if(c == '[') {
                pStack.push(']');
            }
            else if(c == '{') {
                pStack.push('}');
            }
            else {
                if(pStack.isEmpty() || pStack.pop() != c) {
                    return false;
                }
            }  
        }
        return pStack.isEmpty(); 

    }
}
