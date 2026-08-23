class Solution {
    public int maxAreaOfIsland(int[][] grid) {

        int area = 0;
        Set<String> visit = new HashSet<>();
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                area = Math.max(area, dfs(grid, i, j, visit));
            }
        }
        return area;   
    }

    public int dfs(int[][] grid, int i, int j, Set<String> visit) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length ||
        grid[i][j] == 0 || visit.contains(i + "," + j)) return 0;

        visit.add(i + "," + j);
        return 1 + dfs(grid, i+1, j, visit) + dfs(grid, i-1, j, visit) 
        + dfs(grid, i, j+1, visit) + dfs(grid, i, j-1, visit);
        
    }
}
