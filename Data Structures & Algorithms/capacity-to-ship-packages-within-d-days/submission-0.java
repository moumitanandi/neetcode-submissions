class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int lo = 0;
        int hi = 0; 

        for(int w: weights) {
            lo = Math.max(lo, w); //heaviest single package 
            hi += w; //ship everything in 1 day
        }

        while(lo < hi) {
            int mid = lo + (hi -lo)/2;

            if(daysNeeded(weights, mid) <= days) {
                hi = mid; // mid works, try smaller
            }
            else {
                lo = mid +1;
            }
        }

        return lo;

    }

    public int daysNeeded(int[] weights, int capacity) {
        int days = 1; 
        int currentLoad = 0;
        for(int w: weights) {
            if(currentLoad + w > capacity) {
                days++;
                currentLoad = 0;
            }
            currentLoad += w;
        }

        return days;

    }
}