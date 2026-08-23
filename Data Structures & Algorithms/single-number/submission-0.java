class Solution {
    public int singleNumber(int[] nums) {
        int res = 0; 

        for (int num: nums){
            System.out.println("num: " + num);
            res ^= num;
            System.out.println(res);
        }

        return res;
        
    }
}
