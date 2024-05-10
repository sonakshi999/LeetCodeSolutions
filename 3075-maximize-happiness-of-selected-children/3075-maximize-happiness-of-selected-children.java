
class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int n = happiness.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++) {
            pq.add(happiness[i]);
        }
        
        long ans = 0;
        int counter = 0;
        
        for(int i=0;i<k;i++) {
            int top = pq.poll();
            top -= counter;
            if(top>0) {
                ans += top;
            }
            counter++;
        }
        
        return ans;
    }
}