class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rmap = new HashMap<>();
        Map<Integer, Set<Character>> cmap = new HashMap<>();
        Map<String, Set<Character>> gmap = new HashMap<>();

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.') continue;
                
                String key = i/3+ "," + j/3;
                if ((rmap.containsKey(i) && rmap.get(i).contains(board[i][j]))
                || (cmap.containsKey(j) && cmap.get(j).contains(board[i][j])) 
                || (gmap.containsKey(key) && gmap.get(key).contains(board[i][j]))) {
                   System.out.println(" inside" + i);
                    return false;
                }

                rmap.putIfAbsent(i, new HashSet<>());
                rmap.get(i).add(board[i][j]);
                System.out.println(" rmap.get(i)" + i);

                cmap.putIfAbsent(j, new HashSet<>());
                cmap.get(j).add(board[i][j]);
                System.out.println(" cmap.get(j)" + j);

                gmap.putIfAbsent(key, new HashSet<>());
                gmap.get(key).add(board[i][j]);
            
           }
        }
        return true;
    }
}
