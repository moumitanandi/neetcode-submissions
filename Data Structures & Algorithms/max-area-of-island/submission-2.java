class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {  
                    maxArea = Math.max(maxArea, dfs(grid, i, j));
                    System.out.println("inside maxArea: " + maxArea);
                }
            }
        }
        return maxArea;
    }

    private int dfs(int[][] grid, int i, int j) {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) return 0;

        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        grid[i][j] = 0;
        int area = 1;
        System.out.println("area: " + area);
        for(int[] dir: directions) {
            area += dfs(grid, i + dir[0], j + dir[1]);
        }
        return area;
    }
}
