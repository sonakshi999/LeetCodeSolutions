class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        
        int dp[][] = new int[n][m];
        for(int row[]:dp) {
            Arrays.fill(row,-1);
        }
        
        return find(n-1,m-1,grid,dp);
    }
    
    static int find(int i,int j,int[][] matrix,int[][] dp) {
        if (i == 0 && j == 0)
            return matrix[0][0];
        if(i<0 || j<0) {
            return 10000000;
        }
        if(dp[i][j] != -1) {
            return dp[i][j];
        }
        
        int up = matrix[i][j] + find(i-1,j,matrix,dp);
        int left = matrix[i][j] + find(i,j-1,matrix,dp);
        return dp[i][j] = Math.min(up,left);
    }
}