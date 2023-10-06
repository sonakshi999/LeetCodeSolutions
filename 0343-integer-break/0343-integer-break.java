class Solution {
    int[] memo;
    public int integerBreak(int n) {
        if(n<=3) {
            return n-1;
        }
        memo = new int[n+1];
        return dp(n);
    }
    int dp(int n) {
        if(n<=3){
            return n;
        }
        if(memo[n] != 0) {
            return memo[n];
        }
        int ans = n;
        for(int i=2;i<=n;i++) {
            ans = Math.max(i*dp(n-i),ans);
        }
        memo[n]=ans;
        return ans;
    }
}