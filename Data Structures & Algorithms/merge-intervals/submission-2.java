class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> output = new ArrayList<>();

        output.add(intervals[0]);
        for(int[] interval: intervals) {
             //1,3

            int start = interval[0]; //1
            int end = interval[1]; //3

            int lastend = output.get(output.size() - 1)[1]; //3

            if(start <= lastend) {
                output.get(output.size() - 1)[1] = Math.max(lastend, end);
            }
            else {
                output.add(interval);
            }
        }
        

        return output.toArray(new int[output.size()][]);

        
    }
}
