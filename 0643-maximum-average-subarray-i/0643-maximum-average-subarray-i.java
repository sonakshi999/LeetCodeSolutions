class Solution {
    public double findMaxAverage(int[] nums, int k) {
        /*int max = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i = 0; i <= n-k; i++) {
            int loop = k;
            int sum = 0;
            int j = i;
            while(loop > 0) {
                sum += nums[j];
                j++;
                loop--;
            }
            max = Math.max(max,sum);
        }
        double avg = (double) max/k;
        return avg;*/
        int max = Integer.MIN_VALUE, sum = 0;
        for(int i=0;i<k;i++) {
            sum += nums[i];
        }
        max = Math.max(max,sum);
        for(int i=k;i<nums.length;i++) {
            sum += nums[i]-nums[i-k];
            max = Math.max(max,sum);
        }
        double avg = (double) max/k;
        return avg;
    }
}
