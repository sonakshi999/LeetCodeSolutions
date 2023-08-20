class Solution {
    public int arrangeCoins(int n) {
        int len=1;
        int res=0;
        while(n>=len) {
            n=n-len;
            len++;
            res++;
        }
        return res;
    }
}