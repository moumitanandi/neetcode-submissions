class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mArray = new int[nums1.length + nums2.length];
            for(int i = 0; i < nums1.length; i++){
                mArray[i] = nums1[i];
            }
            for(int i = 0; i < nums2.length; i++){
                mArray[nums1.length + i] = nums2[i];
            }

            Arrays.sort(mArray);
            double median = 0.0;
            if(mArray.length % 2 != 0){
                median = mArray[mArray.length / 2];
            }
            else {
                median = (mArray[mArray.length / 2] + mArray[mArray.length / 2 - 1]) / 2.0;
            }
        return median;
    }
}
