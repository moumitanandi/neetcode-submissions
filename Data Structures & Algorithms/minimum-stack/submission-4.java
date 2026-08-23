class MinStack {
    Stack<Integer> st;
    Stack<Integer> minSt;

    public MinStack() {
        st = new Stack<>();
        minSt = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(minSt.isEmpty() || minSt.peek() >= val) {
            minSt.push(val); //-2 -2 -3 -3
        }
    }
    
    public void pop() {
        int val = st.pop();
        if(minSt.peek() == val) {
            minSt.pop(); //-3
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minSt.peek(); //-3
    }
}
