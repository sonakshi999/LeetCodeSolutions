class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int a[] = new int[n];
        for(int i=0;i<n;i++) {
            a[nums[i]]++;
        }
        for(int i=1;i<n;i++) {
            if(a[i]>1){
                return i;
            }
        }
        return 0;
    }
}