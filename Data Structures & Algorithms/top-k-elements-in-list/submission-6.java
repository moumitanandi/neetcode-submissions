class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hmap = new HashMap<>();
        
        for(int n: nums){
            hmap.put(n, hmap.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pqueue = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        for(Map.Entry entry: hmap.entrySet()) {
            pqueue.add(entry);
            if(pqueue.size() > k) {
                pqueue.poll();
            }
        }
        int[] res = new int[k];
        int i = 0;
        while(!pqueue.isEmpty()) {
            res[i] = pqueue.poll().getKey();
            i++;
        }

        return res;
    }
}
