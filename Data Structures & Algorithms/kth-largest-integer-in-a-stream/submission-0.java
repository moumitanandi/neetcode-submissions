class KthLargest {
    private int[] nums;
    private int k;
    private PriorityQueue<Integer> q;

    public KthLargest(int k, int[] nums) {
        this.nums = nums;
        this.k = k;
        this.q = new PriorityQueue<>();
        for(int i: nums){
            q.offer(i);
            if(q.size() > k) {
                System.out.println("constructor" + q.peek());
                q.poll();
            }
        }

    }
    
    public int add(int val) {
        q.offer(val);

        if(q.size() > k) {
            System.out.println(q.poll());
        }
        return q.peek();
    }
}
