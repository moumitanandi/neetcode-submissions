class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int high = 0; 
        int low = 0;
        for(int w: weights) {
            low = Math.max(low, w); //5
            high += w; //19
        }
         System.out.println("inside low" + low);
          System.out.println("inside high" + high);

        while(low < high) {
            int mid = low + (high - low)/2; //5 + 5 = 10
            int daysCanShip = canShip(weights, mid);
            if(daysCanShip <= days) {
                high = mid;
            }
            else {
                low = mid + 1;
            }
             System.out.println("outside" + low);
        }
        return low;

    }

    public int canShip(int[] weights, int mid) {
        int d = 1;
        int load = 0;
        for(int w: weights) {
            if(load + w > mid) { 
                System.out.println("mid" + mid);
                d++;
                load = 0;
            }
            load += w;
        }
        return d;
    }
}