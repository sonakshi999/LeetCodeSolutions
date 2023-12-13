class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0, j = 0;
        while(i<nums.length) {
        
            if(nums[i] == 0) {  // k = 0
                k--;
            }
            if(k < 0) {  // 0 1 1 1 , k = 1
                if(nums[j] == 0) {
                    k++; //k=1
                }
                j++; // j=1
            }
    
            i++;
        }
        return i-j;
    }
}