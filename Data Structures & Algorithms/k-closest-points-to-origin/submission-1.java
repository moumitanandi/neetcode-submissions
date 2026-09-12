class Solution {
    public int[][] kClosest(int[][] points, int k) {
    
        PriorityQueue<int[]> heap = new PriorityQueue<>(Comparator.comparing(a -> a[0]));

        for(int[] pt: points) {
            int sqroot = pt[0]*pt[0] + pt[1]*pt[1];
            heap.offer(new int[]{sqroot, pt[0], pt[1]});
        }

        int[][] result = new int[k][];

        for(int i = 0; i < k; i++) {
            int[] point = heap.poll();
            result[i] = new int[]{point[1], point[2]};
        }

        return result;

    }
}
