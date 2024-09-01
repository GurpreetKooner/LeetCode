class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        if (target < matrix[0][0] || target > matrix[m - 1][n - 1]) {
            return false;
        }

        for (int i = 0; i < m; i++) {

            if (target >= matrix[i][0] && target <= matrix[i][n - 1]) {
                int lo = 0;
                int hi = n - 1;
                while (lo <= hi) {
                    int mid = (lo + hi) / 2;
                    if (target == matrix[i][mid]) {
                        return true;
                    } else if (target < matrix[i][mid]) {
                        hi = mid - 1;
                    } else {
                        lo = mid + 1;
                    }
                }
            }
        }
        return false;
    }
}