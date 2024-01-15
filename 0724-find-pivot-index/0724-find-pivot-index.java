class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = 0;
        for(int i=1;i<n;i++) {
            left[i] = nums[i-1]+left[i-1];
        }
        right[n-1] = 0;
        for(int i=n-2;i>=0;i--) {
            right[i]= nums[i+1]+right[i+1];
        }
        for(int i=0;i<n;i++) {
            if(left[i]==right[i]){
                return i;
            }
        }
        return -1;
    }
}


// 1,7,3,6,5,6
// left = 0,1,8,11,17,22
//right = 27,20,17,11,6,0