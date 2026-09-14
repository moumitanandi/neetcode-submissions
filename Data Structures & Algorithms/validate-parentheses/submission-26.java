class Solution {
    public boolean isValid(String s) {

        Stack<Character> stk = new Stack<>();

        for(char c: s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                stk.push(c);
            }
            else {
                if(stk.isEmpty()) return false;

                char r = stk.pop();
                if((c == ')' && r != '(') || (c == '}' && r != '{') 
                || (c == ']' && r != '[')) return false;
            }
        }
        return stk.isEmpty();
        
    }
}
