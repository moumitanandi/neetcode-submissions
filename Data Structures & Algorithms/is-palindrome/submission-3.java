class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 1) return true;

        int left = 0; 
        int right = s.length() - 1;
        char[] cArray = s.toCharArray();

        while (left < right) {
            if(!Character.isLetterOrDigit(cArray[left])) {
                left++;
            }
            else if(!Character.isLetterOrDigit(cArray[right])) {
                right--;
            }
            else if (Character.toLowerCase(cArray[left]) != Character.toLowerCase(cArray[right])) {
                return false;
                
            }
            else {
                left++;
                right--;
            }
        }
        return true;
    }
}
