class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // as matrix is row wise and column wise sorted, first take row[0][m-1] as start
        // in point, everything below this will be greate to this and everything
        // before this will be smaller to this.
        int n = matrix.length;
        int m = matrix[0].length;
        int row = 0;
        int col = m-1;
        while(row < n && col >= 0) {
            if(matrix[row][col] == target) {
                return true;
            } else if(matrix[row][col] > target) {
                col--;
            } else{
                row++;
            }
        }
        return false;
    }
}