class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 0;
        int left = 0, right = nums.length-1;
        while(left<right) {
            if(nums[left]+nums[right] == k) {
                ans++;
                left++;
                right--;
            }else if(nums[left]+nums[right] < k) {
                left++;
            }else{
                right--;
            }
        }
        return ans;
    }
}