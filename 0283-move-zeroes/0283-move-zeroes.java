class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int count = 0;
        int start = 0;
        for(int i=0;i<n;i++) {
        
            if(nums[i]==0) {
                count++;
            }else{
                if(i>start){
                    int temp = nums[i];
                    nums[i]=nums[start];
                    nums[start]=temp;
                }
                start++;
            }
        }
        for(int i=0;i<count;i++){
            nums[start++]=0;
        }
    }
   
}