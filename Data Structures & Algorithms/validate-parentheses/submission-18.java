class Solution {
    public boolean isValid(String s) {
        Stack<Character> pstack = new Stack<>();

        for(char c: s.toCharArray()) {
            if(!pstack.isEmpty() && c == ']' && pstack.peek() == '[') {
                pstack.pop();
            }
            else if(!pstack.isEmpty() && c == ')' && pstack.peek() == '(') {
                pstack.pop();
            }
            else if(!pstack.isEmpty() && c == '}' && pstack.peek() == '{') {
                pstack.pop();
            }
            else {
                pstack.push(c); 
            }
        }
        return pstack.isEmpty();
    }
}
