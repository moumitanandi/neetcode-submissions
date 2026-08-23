class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1) return stones[0];
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> b - a);
       
        for(int s: stones){
            q.offer(s); // 2 2 1
        }
        while(q.size() > 1) {
            int x = q.poll();
            int y = q.poll();
            System.out.println( x - y);
            if(x > y) {
                q.offer(x - y);
            }
        }
        q.offer(0);
        return Math.abs(q.peek());
        
    }
}
