class Solution {
    public int majorityElement(int[] nums) {
        int maj = 0;
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i,0)+1);
            if(map.get(i) > maj) {
                res = i;
                maj = map.get(i);
            }
        }
        return res;
    }
}