class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i = 0; i <= n-k; i++) {
            int loop = k;
            int sum = nums[i];
            int j = i+1;
            loop--;
            while(loop > 0) {
               sum += nums[j];
                j++;
                loop--;
            }
            max = Math.max(max,sum);
        }
        double avg = (double) max/k;
        return avg;
    }
}