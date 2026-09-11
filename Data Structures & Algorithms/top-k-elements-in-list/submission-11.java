class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap();

        for(int n: nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(
            (a, b) -> a.getValue() - b.getValue());
        
        for(Map.Entry<Integer, Integer> entry: freq.entrySet()) {
            heap.add(entry);
            if(heap.size() > k) {
                heap.poll();
            }
        }

        int[] res = new int[k];
        for(int i = 0; i < k; i++) {
            res[i] = heap.poll().getKey();
        }
        
        return res;
        
    }
}
