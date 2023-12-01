class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        left[0]=1;
        for(int i=1;i<nums.length;i++) {
            left[i] = left[i-1]*nums[i-1];
        }
        int right[] = new int[nums.length];
        right[nums.length-1] = 1;
        for(int i=nums.length-2;i>=0;i--) {
            right[i]=right[i+1]*nums[i+1];
            left[i]=left[i]*right[i];
        }
        /*int ans[] = new int[nums.length];
        for(int i = 0;i<nums.length;i++) {
            ans[i] = left[i]*right[i];
        }*/
        return left;
    }
}


//original= [1,2,3,4]
// left =   [1,1,2,6]
// right =  [24,12,4,1]
// ans =    [24,12,8,6]
