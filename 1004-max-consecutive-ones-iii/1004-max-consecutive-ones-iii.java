class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = 0;
        int count = 0;
        int kk = k;
        int start = 0;
        for(int i=0;i<nums.length;) {
            if(nums[i]==1){
                count++;
                i++;
            }else if(nums[i]==0 && kk>0){
                kk--;
                count++;
                i++;
            }else if(nums[i]==0 && kk<=0){
               start++;
               i = start;
               kk = k;
               count = 0;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}