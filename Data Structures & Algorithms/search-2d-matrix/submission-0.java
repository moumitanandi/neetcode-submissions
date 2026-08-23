class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int j = matrix.length;
        int k = matrix[0].length;
        int i = 0; 
        while (i < j) {
            int l = i + (j - i) / 2;
            if(matrix[l][0] == target) {
                return true;
            }
            else if(matrix[l][0] < target) {
                i++;
            }
            else {
                j--;
            }
        }
        i = 0;
        while (i < k) {
            int l = i + (k - i) / 2;
            if(matrix[0][l] == target) {
                return true;
            }
            else if(matrix[0][l] < target) {
                i++;
            }
            else {
                k--;
            }
        }
     return false;
    }
}
