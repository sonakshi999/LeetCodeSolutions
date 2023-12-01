class Solution {
    public boolean increasingTriplet(int[] nums) {
        int small = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++) {
            int curr = nums[i];
            if(curr <= small) {
                small = curr;
            }else if(curr <= mid) {
                mid = curr;
            }else{
                return true;
            }
        }
        return false;
    }
}