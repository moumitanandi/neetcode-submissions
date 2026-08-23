class MinStack {

    Stack<Integer> stack;
    Stack<Integer> mstack;

    public MinStack() {
        stack = new Stack<>();
        mstack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        val = Math.min(val, mstack.isEmpty() ? val : mstack.peek());
        mstack.push(val);

    }
    
    public void pop() {
        stack.pop();
        mstack.pop();
    }
    
    public int top() {
       return stack.peek();
    }
    
    public int getMin() {
        return mstack.peek();
    
    }
}
