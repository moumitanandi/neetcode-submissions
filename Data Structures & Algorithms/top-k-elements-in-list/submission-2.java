class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> myMap = new HashMap<>();

        for(int i: nums) {
            myMap.put(i, myMap.getOrDefault(i, 0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> queue = 
        new PriorityQueue<>((a, b) -> (a.getValue() - b.getValue()));

        for(Map.Entry<Integer, Integer> entry: myMap.entrySet()) {
            queue.add(entry);
            if(queue.size() > k) {
                queue.poll();
            }
        }

        int i = 0;
        while(i <= k && !queue.isEmpty()) {
            result[i] = queue.poll().getKey();
            i++;
        }

        return result;

    }
}
