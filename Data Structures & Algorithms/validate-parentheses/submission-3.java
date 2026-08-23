class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> myMap = new HashMap<>();
        myMap.put(')', '(');
        myMap.put('}', '{');
        myMap.put(']', '[');
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(myMap.containsKey(c)) {
                if(!stack.isEmpty() && 
                myMap.get(c) == stack.peek()) {
                    stack.pop();
                }
                else return false;
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
