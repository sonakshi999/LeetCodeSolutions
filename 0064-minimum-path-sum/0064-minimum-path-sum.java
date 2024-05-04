class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        
        int dp[][] = new int[n][m];
        
        return find(n-1,m-1,grid,dp);
    }
    
    int find(int i,int j,int[][] grid,int[][] dp) {
        if(i==0 && j==0) {
            return grid[i][j];
        }
        
        if(dp[i][j] != 0) {
            return dp[i][j];
        }
        
        if(i>0 && j>0) {
            return dp[i][j]=Math.min(find(i-1,j,grid,dp),find(i,j-1,grid,dp))+grid[i][j];
            
        }else if(i>0) {
            return dp[i][j]=grid[i][j]+find(i-1,j,grid,dp);
            
        }else if(j>0) {
            return dp[i][j]=grid[i][j]+find(i,j-1,grid,dp);
        }
        return 0;
    }
}