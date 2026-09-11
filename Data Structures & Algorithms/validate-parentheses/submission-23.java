class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack();
        for(char c: s.toCharArray()) {

            if(c == '(' || c == '{' || c == '[') {
                stk.push(c);
            }
            else {
                if(stk.isEmpty()) return false;

                char cp = stk.pop();
                if((c == ']' && cp != '[') || (c == '}' && cp != '{') 
                || (c == ')' && cp != '(')) {
                    return false;
                }
            }
        }
        return stk.isEmpty();
    }
}
