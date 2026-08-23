class Solution {
    public int scoreOfString(String s) {
        int count = 0; 
        for(int i = 1; i < s.length(); i++) {
            count += Math.abs((int)s.charAt(i) - (int)s.charAt(i-1));
            System.out.println(count);
        }
        return count;
    }
}