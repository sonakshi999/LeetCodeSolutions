class Solution {
    public int arraySign(int[] nums) {
        int countZ = 0;
        int countN = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 0) {
                countZ++;
            }else if(nums[i] < 0) {
                countN++;
            }
        }
        if(countZ != 0) {
            return 0;
        }
        if(countN % 2 != 0){
            return -1;
        }
        return 1;
    }
}