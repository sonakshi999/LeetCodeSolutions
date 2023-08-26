class Solution {
    public int findLongestChain(int[][] pairs) {
        int n = pairs.length;
        Arrays.sort(pairs, (a,b) -> a[0]==b[0] ? a[1]-b[1] : a[0]-b[0]);
        int ans = 0;
        int memo[] = new int[n];
        for(int i=0;i<n;i++) {
            ans = Math.max(ans,longestPairsChain(i,pairs,n,memo));
        }
        return ans;
    }
    int longestPairsChain(int i,int[][] pairs,int n,int[] memo) {
        if(memo[i] != 0){
            return memo[i];
        }
        memo[i]=1;
        for(int j=i+1;j<n;j++) {
            if(pairs[i][1] < pairs[j][0]){
                memo[i]=Math.max(memo[i],1+longestPairsChain(j,pairs,n,memo));
            }
        }
        return memo[i];
    }
}