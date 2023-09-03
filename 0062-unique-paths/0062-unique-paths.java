/*class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        return countPath(0,0,m,n,dp);
    }
    int countPath(int i,int j,int m,int n,int[][] dp){
        if(i>=m || j>=n) {
            return 0;
        }
        if(i==m-1 && j==n-1) {
            return 1;
        }
        if(dp[i][j] != 0) { return dp[i][j]; }
        return dp[i][j] = countPath(i+1,j,m,n,dp) + countPath(i,j+1,m,n,dp);
    }
}*/


// TC = o(n*m);
//SC = O(n*m);
class Solution {
    public int uniquePaths(int m, int n) {
        // total path = m+n-2 (c) m-1 or m+n-2 (c) n-1
        //int ans = (m+n-2) C (m-1)
        int N = m+n-2;
        int r = m-1;
        double res = 1;
        for(int i=1;i<=r;i++) {
            res = res * (N-r+i)/i;
        }
        return (int) res;
    }
}


//TC = O(m-1) or O(n-1)
//SC = O(1)