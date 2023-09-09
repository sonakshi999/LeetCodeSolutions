class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m+1][n+1];
        return solve(0,0,m,n,dp);
    }
    int solve(int i,int j,int m, int n, int dp[][]) {
        if(dp[i][j] != 0) {
            return dp[i][j];
        }
        if(i==m-1 && j==n-1) {
            return 1;
        }
        if(i >= m || j>= n) {
            return 0;
        }
        
        return dp[i][j] = solve(i,j+1,m,n,dp) + solve(i+1,j,m,n,dp);
    }
}