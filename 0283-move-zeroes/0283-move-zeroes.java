class Solution {
    public void moveZeroes(int[] nums) {
        int zeros = 0;
        int start = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==0) {
                zeros++;
            }else{
                nums[start++]=nums[i];
            }
        }
        for(int i=0;i<zeros;i++){
            nums[start++]=0;
        }
    }
}