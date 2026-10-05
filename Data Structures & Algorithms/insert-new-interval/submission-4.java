class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

       List<int[]> output = new ArrayList<>();
        // output.add(interval[0]);
        boolean added = false;

        for(int[] interval: intervals) {
            if(interval[1] < newInterval[0]) { //[1,3] [4,6]
                output.add(interval); 
            }
            else if(interval[0] > newInterval[1]) { //no [9,10] [6,7]
                if(!added) {
                    output.add(newInterval);
                }
                added = true;
              output.add(interval);

            }
            else { //[1,3][4,6]   [2,5]
                newInterval[0] = Math.min(newInterval[0], interval[0]); //1 
                newInterval[1] = Math.max(newInterval[1], interval[1]); //5 6
                   
            }
        }
        if(!added){
            output.add(newInterval);

        }

        return output.toArray(new int[output.size()][]);
    }
}
