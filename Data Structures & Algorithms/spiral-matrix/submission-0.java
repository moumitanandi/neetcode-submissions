class Solution {
    //O(m*n)
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int top = 0;
        int left = 0;
        int right = matrix[0].length;
        int bottom = matrix.length;
        int maxLength = right * bottom;

        while (top < bottom && left < right) {

            for(int i = left; i < right && result.size() < maxLength; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            for(int i = top; i < bottom && result.size() < maxLength; i++) {
                result.add(matrix[i][right-1]);
            }
            right--;
            for(int i = right -1; i >= left && result.size() < maxLength; i--) {
                result.add(matrix[bottom-1][i]);
            }
            bottom--;
            for(int i = bottom-1; i >= top && result.size() < maxLength; i--) {
                result.add(matrix[i][left]);
            }
            left++;
        }

        return result;
        
    }
}
