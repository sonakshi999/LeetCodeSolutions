class Solution {
    int dp[];
    public int integerBreak(int n) {
        if(n <= 3) {
            return n-1;
        }
        dp = new int[n+1];
        return fn(n);
    }
    int fn(int n) {
        if(n<=3) {
            return n;
            // as dividing them will make product samller only
        }
        if(dp[n] != 0) {
            return dp[n];
        }
        int product = 1;
        // n ko chhote chhote parts m divide karo starting from 2 as 1 se start kene pr product will decrease only as 5 = 1+4 pro = 4
        for(int i = 2;i<=n;i++) {
            product = Math.max(product, i*fn(n-i));
        }
        dp[n] = product;
        return product;
    }
}