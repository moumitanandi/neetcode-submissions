class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();

        for(char c: s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                stk.push(c);
            }
            else {
                if(stk.isEmpty()) return false;

                char brk = stk.pop();
                if((c == ')' && brk != '(') || (c == '}' && brk != '{') || 
                (c == ']' && brk != '[')) {
                    return false;
                }
            }
        }
        return stk.isEmpty();
        
    }
}
