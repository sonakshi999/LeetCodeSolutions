class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones) pq.add(i);
        while(pq.size() != 1) {
            int x = pq.poll();
            int y = pq.poll();
            pq.add(x-y);
        }
        return pq.poll();
    }
}