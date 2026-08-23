class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
       
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == '1') {
                   bfs(grid, i, j);
                   count++; 
                }
            }
        }
        return count;

    }

    private void bfs(char[][] grid, int i, int j) {
        Queue<int[]> q = new LinkedList<>();
        int[][] directions = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
        grid[i][j] = '0';
        q.add(new int[]{i, j});

        while(!q.isEmpty()) {
            int[] node = q.poll();
            
            for(int[] dir: directions) {
                int r = node[0] + dir[0];
                int c = node[1] + dir[1];

                if(r >= 0 && c >= 0 && 
                r < grid.length && c < grid[0].length && 
                grid[r][c] == '1') {
                    q.add(new int[]{r, c});
                    grid[r][c] = '0';
                }
            }
        }
    }
}
