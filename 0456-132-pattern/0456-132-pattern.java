class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> sc = new Stack<>();
        int n = nums.length;
        
        int third = Integer.MIN_VALUE;
        
        for(int i = n-1;i>=0;i--) {
            if(nums[i] < third) return true;
            while(!sc.isEmpty()  && sc.peek()<nums[i]) {
                third = sc.pop();
            }
            sc.add(nums[i]);
        }
        return false;
    }
}