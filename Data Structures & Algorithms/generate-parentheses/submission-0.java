class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> out = new ArrayList<>();
        Stack<Character> stack = new Stack();
        dp(n, 0, 0, stack, out);
        return out;
    }

    public void dp(int n, int start, int end, Stack<Character> stack, List<String> out) {
        if(start < n){
            stack.push('(');
            dp(n, start+1, end, stack, out);
            stack.pop();
        }
        if(end < start){
            stack.push(')');
            dp(n, start, end+1, stack, out);
            stack.pop();
        }
        if(start == end && start == n){
            StringBuilder sb = new StringBuilder();
            for(Character c: stack) {
                sb.append(c);
            }
            out.add(sb.toString());
            return;
        }
    }

}
