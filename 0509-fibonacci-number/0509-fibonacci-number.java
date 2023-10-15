class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return fn(n,dp);
    }
    int fn(int n , int dp[]) {
        if(n <= 1) {
            return n;
        }
        if(dp[n] != -1) {
            return dp[n];
        }
        return  dp[n] = fn(n-1,dp) + fn(n-2,dp);
    }
}