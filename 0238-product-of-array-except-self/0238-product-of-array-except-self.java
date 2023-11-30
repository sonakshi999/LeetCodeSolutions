class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        for(int i=0;i<nums.length;i++) {
            product = product * nums[i];
        }
        int ans[] = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            if(nums[i] != 0){
             ans[i] = product/nums[i];
            }else{
                int temp = 1;
                for(int j=0;j<nums.length;j++) {
                    if(j!=i) {
                        temp*= nums[j];
                    }
                }
                ans[i] = temp;
            }
        }
        return ans;
    }
}