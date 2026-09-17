class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {

        Map<Integer, List<int[]>> edges =  new HashMap<>();

        for(int[] time: times) { //ui, vi, ti
            edges.computeIfAbsent(time[0], key -> new ArrayList<>()).add(new int[]{time[1], time[2]});
        }

        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        heap.offer(new int[]{0, k}); //{distance, node}

        Set<Integer> visited = new HashSet<>();
        int t = 0;
        
        while(!heap.isEmpty()) {
            int[] curr = heap.poll();
            int dist = curr[0];
            int node = curr[1];
            if(!visited.add(node)) {
              continue;
            }
            t = dist;
 
            if(edges.containsKey(node)) {
                for(int[] next: edges.get(node)) {
                    if(!visited.contains(next[0])) {
                        heap.offer(new int[]{ dist + next[1], next[0]});
                    }
                }
            }
        }

        return visited.size() == n ? t: -1;

    }
}
