class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i:piles) {
            max = Math.max(i,max);
        }
        // answer will lie between 1 to max.
        int start = 1, end = max;
        while(start < end) {
            int mid = start + (end-start)/2;
            if(countHours(piles,mid) > h) {
                start = mid+1;
            }else{
                end = mid;
            }
        }
        
        return end;
    }
    int countHours(int[] piles, int perhour) {
        int ans = 0;
        for(int i:piles) {
            ans +=  Math.ceil((double)(i) / (double)(perhour));
        }
        return ans;
    }
}