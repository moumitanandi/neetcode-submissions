class Solution {
    public int majorityElement(int[] nums) {
        int maj = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> q = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            q.offer(entry);
        }

        return q.peek().getKey();
    }
}