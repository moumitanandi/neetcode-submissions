class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] result = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>(); //temp, index


        for(int i = 0; i < temperatures.length; i++) {
            int temp = temperatures[i]; 
            int j = i + 1;
            while(!stack.isEmpty() && temp > stack.peek()[0]) { 
                int[] pair = stack.pop();
                int index = pair[1];
                result[index] = i - index;
            }
            stack.push(new int[]{temp, i});
        }

        return result;
       
    }
}
