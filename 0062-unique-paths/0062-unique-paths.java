class Solution {
    public int uniquePaths(int m, int n) {
        int i = 0, j = 0;
        int dp[][] = new int[m][n];
        return solve(i,j,m,n,dp);
    }
    int solve(int i, int j, int m,int n,int dp[][]) {
        if(i>=m || j>=n) {
            return 0;
        }
        if(i==m-1 && j==n-1) {
            return 1;
        }
        if(dp[i][j] != 0) {
            return dp[i][j];
        }
        dp[i][j] = solve(i+1,j,m,n,dp) + solve(i,j+1,m,n,dp);
        return dp[i][j];
    }
}