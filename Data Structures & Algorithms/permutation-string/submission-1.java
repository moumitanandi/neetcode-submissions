class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int counter = 0;
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for(int i = 0; i < s1.length(); i++) {
            arr1[s1.charAt(i) - 'a']++;
            arr2[s2.charAt(i) - 'a']++;
        }
        if(Arrays.equals(arr1, arr2)) return true; 

        System.out.println("1 if: " + counter);
        if(counter == s1.length()) return true;

        // we have moved the window one step towards right
        // so freq of char at idx should increase
        // and freq of left most char in prev window should decrease
        for(int i = s1.length(); i < s2.length(); i++){
            arr2[s2.charAt(i) - 'a']++;
            arr2[s2.charAt(i - s1.length()) - 'a']--;

            if(Arrays.equals(arr1, arr2)) return true; 
    
        }
        
        return false;
       
    }
}
