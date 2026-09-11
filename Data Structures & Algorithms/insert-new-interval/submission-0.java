class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> output = new ArrayList<>();
        boolean added = false;
        for(int[] interval: intervals) {
            if(interval[1] < newInterval[0]) {
                output.add(interval);
            }
            else if(interval[0] > newInterval[1]) {
                if(!added) {
                    output.add(newInterval);
                    added = true;
                }
                output.add(interval);
            }
            else {
                newInterval[0] = Math.min(interval[0], newInterval[0]);
                newInterval[1] = Math.max(interval[1], newInterval[1]);
                
            }
        }

        if(!added) {
            output.add(newInterval);
        } 
            

        return output.toArray(new int[output.size()][]);
        
    }
}
