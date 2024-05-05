class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(i==0 && j==0) {
                    dp[i][j]=1;
                }else if(i==0) {
                    dp[i][j] = dp[i][j-1];
                }else if(j==0) {
                    dp[i][j]= dp[i-1][j];
                }else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
        
    }
    /*int find(int i,int j, int[][]dp) {
        if(i<0 || j<0) {
            return 0;
        }
        if(i==0 && j==0) {
            return 1;
        }
        if(dp[i][j] != 0) {
            return dp[i][j];
            
        }
        
        int l = find(i-1,j,dp);
        int r = find(i,j-1,dp);
        return dp[i][j] = l+r;
    }*/
}