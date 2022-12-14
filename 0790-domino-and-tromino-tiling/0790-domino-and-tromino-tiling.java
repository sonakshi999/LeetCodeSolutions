class Solution {
    public int numTilings(int n) {
        if(n==1 || n==2) return n;
        int dp[] = new int[n+1];
        dp[0] = 1; 
        dp[1] = 1; 
        dp[2] = 2;
        int mod = 1000000007;
        for(int i=3;i<=n;i++) {
            dp[i] = ((2*(dp[i-1] % mod)) % mod + (dp[i-3]%mod)) % mod;
        }
        return dp[n];
    }
}