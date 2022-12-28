class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:piles) { 
            pq.add(i);
        }
        int ans = 0;
        while (k-- > 0 ) { 
            int i = pq.poll();
            //i = i - (int)Math.floor(i/2);
            pq.add(i-i/2);
        }
        for(int i:pq) {
            ans += i;
        }
        return ans;
    }
}