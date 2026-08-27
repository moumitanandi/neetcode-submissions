class Solution {
    public boolean isValid(String s) {
        Stack<Character> pstack = new Stack<>();

        for(char c: s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                pstack.push(c);
            }
            else {
                if(pstack.isEmpty()) return false;
                char cp = pstack.pop();
                if((c == ')' && cp != '(') || 
                (c == '}' && cp != '{') || 
                (c == ']' && cp != '[')) return false;
            }
            
        }
        return pstack.isEmpty();
    }
}
