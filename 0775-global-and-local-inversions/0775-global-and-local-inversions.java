class Solution {
    public boolean isIdealPermutation(int[] nums) {
        int n = nums.length;
        int max = -1;
        for(int i=0;i<n-2;i++) {
            max = Math.max(nums[i],max);
            if(max > nums[i+2]) {
                return false;
            }
        }
        return true;
    }
}