class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        
        for(int n : arr) {
            mp.put(n,mp.getOrDefault(n,0)+1);
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(mp.values());
        
        while(!pq.isEmpty() && k > 0) {
            if(pq.peek()<=k) {
                k = k-pq.peek();
                pq.poll();
            }else{
                break;
            }
        }
        return pq.size();
    }
}