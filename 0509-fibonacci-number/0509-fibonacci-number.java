class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        int[] dp = new int[n+1];
        dp[0]=0;dp[1]=1;
        if(n<=1) {
            return dp[n];
        }
        if(dp[n] !=0) {
            return dp[n];
        }
        dp[n] = fib(n-1)+fib(n-2);
        return dp[n];
    }
}