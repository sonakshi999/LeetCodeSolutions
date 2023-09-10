class Solution {
    public int uniquePathsWithObstacles(int[][] obs) {
        int m = obs.length;
        int n = obs[0].length;
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(obs[i][j] ==1) {
                    dp[i][j] = -1;
                }
            }
        }
        return solve(0,0,m,n,dp);
    }
    int solve(int i,int j,int m,int n, int dp[][]) {
        
        if(i>=m || j>=n || dp[i][j] == -1) {
            return 0;
        }
        if(i==m-1 && j==n-1) {
            return 1;
        }
        
        if(dp[i][j] != 0) {
            return dp[i][j];
        }
        
        
        int res = solve(i+1,j,m,n,dp) + solve(i,j+1,m,n,dp);
        dp[i][j] = res;
        return dp[i][j];
    }
}