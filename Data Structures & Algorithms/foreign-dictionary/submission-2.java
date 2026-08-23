class Solution {
    public String foreignDictionary(String[] words) {
        Map<Character, List<Character>> adjMap = new HashMap<>();
        Map<Character, Boolean> visited = new HashMap<>();
        List<Character> result = new ArrayList<>();

        for(String word: words) {
            for(char c: word.toCharArray()){
                adjMap.putIfAbsent(c, new ArrayList<>());
            }    
        }

        for(int i = 0; i < words.length-1; i++) {
            String s1 = words[i], s2 = words[i+1];
            int minLen = Math.min(s1.length(), s2.length());
            if (s1.length() > s2.length() && s1.substring(0, minLen).equals(s2.substring(0, minLen))) {
                return "";
            }
            for( int j = 0; j < minLen; j++) {
                if(s1.charAt(j) != s2.charAt(j)){
                    adjMap.get(s1.charAt(j)).add(s2.charAt(j));
                    break;
                }
            }
        }
        for(char c: adjMap.keySet()) {
            if(dfs(c, adjMap, visited, result)) {
                return "";
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = result.size() -1; i >= 0; i--) {
            sb.append(result.get(i));
        }
        return sb.toString();
 
    }

    private boolean dfs(char c, Map<Character, List<Character>> adjMap, Map<Character, Boolean> visited, List<Character> result ) {

        if(visited.containsKey(c)) {
            return visited.get(c);
        }

        visited.put(c, true);

        for(char i : adjMap.get(c)) {
            if(dfs(i, adjMap, visited, result)) {
                return true;
            }
        }
        visited.put(c, false);
        result.add(c);
        return false;
    }
}
