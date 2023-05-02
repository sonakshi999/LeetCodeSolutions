class Solution {
    public int arraySign(int[] nums) {
        int countZ = 0;
        int countN = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 0) {
                return 0;
            }else if(nums[i] < 0) {
                countN++;
            }
        }
        if(countN % 2 != 0){
            return -1;
        }
        return 1;
    }
}