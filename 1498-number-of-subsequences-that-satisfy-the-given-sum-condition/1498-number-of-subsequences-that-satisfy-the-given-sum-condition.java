class Solution {
    public int numSubseq(int[] nums, int target) {
        int n = nums.length;
        int mod = 1_000_000_007;
        Arrays.sort(nums);
        
        int[] pow = new int[n];
        pow[0] = 1;
        for(int i=1;i<n;i++) {
            pow[i] = (pow[i-1] * 2) % mod;
        }
        
        int res = 0;
        int left = 0, right = n-1;
        while(left <= right) {
            if(nums[left] + nums[right] <= target) {
                res += pow[right-left];
                res %= mod;
                left++;
            }else{
                right--;
            }
        }
        return res;
    }
}