class Solution {
    public int eraseOverlapIntervals(int[][] in) {
        
        Arrays.sort(in, (a,b) -> a[1]-b[1]);
       
        int ans = 1;
        int end = in[0][1];
        int n = in.length;
        
        if(n==1) {
            return 0;
        }
        
        for(int i=1;i<n;i++) {
            if(in[i][0] >= end) {
                ans++;
                end = in[i][1];
            }
        }
        return n-ans;
        
    }  
}