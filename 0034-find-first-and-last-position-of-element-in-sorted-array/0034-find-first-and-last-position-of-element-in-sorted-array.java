class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        int found = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == target) {
                found = 1;
                ans[0] = i;
                for(int j=i;j<nums.length;j++) {
                    if(nums[j]==target){
                        ans[1] = j;
                    }else{
                        break;
                    }
                }
            }
            if(found==1){
                break;
            }
        }
        if(found == 0) {
            ans[0]=-1;
            ans[1]=-1;
        }
        return ans;
    }
}