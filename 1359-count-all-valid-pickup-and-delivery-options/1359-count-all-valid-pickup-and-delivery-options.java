class Solution {
    public int countOrders(int n) {
        long res = 1, mod = 1000000007;
        for(int i=1;i<=n;i++) {
            res = res * ((i)*(2*i-1)) % mod;
        }
        return (int)res;
    }
}