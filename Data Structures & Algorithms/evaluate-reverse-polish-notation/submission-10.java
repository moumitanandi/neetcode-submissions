class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String s: tokens){
            if(s.equals("+")) {
                int res = st.pop() + st.pop();
                st.push(res);
            }
            else if(s.equals("*")) {
                int res = st.pop() * st.pop();
                st.push(res);
            }
            else if(s.equals("-")) {
                int a = st.pop();
                int b = st.pop();
                int res = b - a;
                st.push(res);
            }
            else if(s.equals("/")) {
                int a = st.pop();
                int b = st.pop();
                int res = b / a;
                st.push(res);
            }
            else {
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}
