class Solution {
    public int fib(int n) {
        int prev2 = 0;
        int prev = 1;
        int curr = 0;
        for(int i=0;i<n;i++) {
            curr = prev + prev2;
            prev2 = prev;
            prev = curr;
        }
        return prev2;
    }
}