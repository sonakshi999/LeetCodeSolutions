class Solution {
    public int longestSubarray(int[] nums) {
        int k = 1;
        int start = 0, end = 0;
        while(end<nums.length) {
            if(nums[end]==0){
                k--;
            }
            if(k<0){
                if(nums[start]==0){
                    k++;
                }
                start++;
            }
            end++;
        }
        return end-start-1;
    }
}