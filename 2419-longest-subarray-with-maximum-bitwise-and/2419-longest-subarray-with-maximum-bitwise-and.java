class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        for(int i=0;i<nums.length;i++) {
            max = Math.max(max,nums[i]);
        }
        int len = 0,ans = 1;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == max) {
                len++;
                ans = Math.max(len,ans);
            }else{
                len = 0;
            }
        }
        return ans;
    }
}