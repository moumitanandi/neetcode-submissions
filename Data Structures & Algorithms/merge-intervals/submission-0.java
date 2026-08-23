class Solution {
     public int[][] merge(int[][] intervals) {

        List<int[]> output = new ArrayList<>();
            output.add(intervals[0]);

            for(int[] interval : intervals) {
                int start = interval[0];
                int end = interval[1];
                int lastEnd = output.get(output.size() - 1)[1]; //3

                if(start <= lastEnd) {
                    output.get(output.size() - 1)[1] = Math.max(lastEnd, end);
                }
                else {
                    output.add(new int[]{start, end});
                }
            }

            return output.toArray(new int[output.size()][]);

        }
    }
