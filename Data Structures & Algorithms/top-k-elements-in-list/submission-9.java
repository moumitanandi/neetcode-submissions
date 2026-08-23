class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> elementMap = new HashMap<>();

        for(int n: nums){
            elementMap.put(n, elementMap.getOrDefault(n, 0) + 1);
        }
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for(Map.Entry<Integer, Integer> entry: elementMap.entrySet()){
            queue.offer(new int[]{entry.getValue(), entry.getKey()});
            if(queue.size() > k) {
                queue.poll();
            }
            
        }

        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = queue.poll()[1];
        }
        return result;
    }
}
