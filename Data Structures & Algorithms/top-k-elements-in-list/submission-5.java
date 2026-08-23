class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> myMap = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1]; 
        for(int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }
        for(int n: nums) {
            myMap.put(n, myMap.getOrDefault(n, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry: myMap.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }
        int[] result = new int[k];
        int index = 0;
        for(int i = freq.length -1; i >= 0 && index < k; i--){
            for(int n: freq[i]) {
                result[index++] = n;
            }
        }
        return result;

    }
}
