class Solution {
    public int minimumRecolors(String blocks, int k) {
        int ans = 0;
        int count = 0;
        for(int i=0;i<k;i++) {
            if(blocks.charAt(i) == 'B') {
                count++;
            }
        }
        ans = count;
        for(int i=k;i<blocks.length();i++) {
            count += blocks.charAt(i)=='B'? 1 : 0;
            count -= blocks.charAt(i-k)=='B'? 1 : 0;
            ans = Math.max(ans,count);
        }
        return k-ans;
    }
}