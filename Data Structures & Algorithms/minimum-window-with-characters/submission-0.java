class Solution {
    //O(n)
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) return "";

        // Create a hashmap to save the frequency of each character in the target substring t
        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Maintain a counter to check how many characters match the target string
        int matchCounter = map.size();
        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;

        // Loop over the string s with the right pointer
        while (right < s.length()) {
            char rightChar = s.charAt(right);

            // Decrease the frequency of the right character in the map
            if (map.containsKey(rightChar)) {
                map.put(rightChar, map.get(rightChar) - 1);
                if (map.get(rightChar) == 0) {
                    matchCounter--;
                }
            }
            right++;

            // Increase the left pointer to maintain the window's validity
            while (matchCounter == 0) {
                // Update the minimum window if the current window is smaller
                if (right - left < minLen) {
                    minLen = right - left;
                    minStart = left;
                }

                char leftChar = s.charAt(left);

                // Move the left pointer to the right and adjust the map and counter
                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);
                    if (map.get(leftChar) > 0) {
                        matchCounter++;
                    }
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}
