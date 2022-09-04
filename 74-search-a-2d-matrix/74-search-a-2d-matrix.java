class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int colums = matrix[0].length;
        int reqRow = 0;
        boolean result = false;

        for (int i = 0; i < rows; i++) {
            if (matrix[i][colums - 1] == target) {
                return true;
            }
            if (matrix[i][colums - 1] > target) {
                reqRow = i;
                break;
            }
        }

        int start = 0;
        int end = colums - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (matrix[reqRow][mid] == target) {
                result = true;
                break;
            }
            if (matrix[reqRow][mid] < target) 
                start = mid + 1; 
            
            else end = mid - 1;
        }

        return result;
    }
}
