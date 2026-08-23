class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> preMap = new HashMap<>();
        Set<Integer> visited = new HashSet<>();

        for(int i = 0; i < numCourses; i++){
            preMap.put(i, new ArrayList<>());
        }

        for(int[] pre: prerequisites) {
            preMap.get(pre[0]).add(pre[1]);
        }

        for(int i = 0; i < numCourses; i++){
            if(!dfs(i, preMap, visited)) {
                return false;
            }
        }
        return true;     
    }

    public boolean dfs(int i, Map<Integer, List<Integer>> preMap, Set<Integer> visited) {
        if(visited.contains(i)) return false;
        if(preMap.get(i).isEmpty()) return true;

        visited.add(i);
        for (Integer pre: preMap.get(i)) {
            if(!dfs(pre, preMap, visited)) {
               return false;
            }
        }
        visited.remove(i);
        preMap.put(i, new ArrayList<>());

        return true;
    }
}
