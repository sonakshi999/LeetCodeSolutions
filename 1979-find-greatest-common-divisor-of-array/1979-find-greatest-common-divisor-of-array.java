class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int n:nums){
            min = Math.min(min,n);
            max = Math.max(max,n);
        }
        return gcd(max,min);
    }
    int gcd(int n, int m) {
        if(m>n){
            return gcd(m,n);
        }
        if(m==0) {
            return n;
        }
        return gcd(n-m,m);
    }
    
}