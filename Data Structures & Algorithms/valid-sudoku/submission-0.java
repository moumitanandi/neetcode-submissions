class Solution {
    public boolean isValidSudoku(char[][] board) {
                Map<Integer, Set<Character>> rowMap = new HashMap<>();
        Map<Integer, Set<Character>> colMap = new HashMap<>();
        Map<Integer, Set<Character>> squareMap = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char cell = board[i][j];
                if (board[i][j] == '.') {
                    continue;
                }
                if (rowMap.getOrDefault(i, new HashSet<>()).contains(cell) ||
                        colMap.getOrDefault(j, new HashSet<>()).contains(cell) ||
                        squareMap.getOrDefault((i/3) * 3 + (j/3), new HashSet<>()).contains(cell)) {
                    return false;
                }
                if(!rowMap.containsKey(i)) {
                    rowMap.put(i, new HashSet<>());
                }
                rowMap.get(i).add(cell);

                if(!colMap.containsKey(j)) {
                    colMap.put(j, new HashSet<>());
                }
                colMap.get(j).add(cell);

                if(!squareMap.containsKey((i/3) * 3 + (j/3))) {
                    squareMap.put((i/3) * 3 + (j/3), new HashSet<>());
                }
                squareMap.get((i/3) * 3 + (j/3)).add(cell);
            }
        }
        return true;
    }
}
