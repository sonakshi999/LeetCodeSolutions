class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        int count = 0;
        for(int n : nums) {
            if(mp.get(k-n) != null && mp.get(k-n) >0) {
                count++;
                mp.put((k-n),mp.getOrDefault((k-n),0)-1);
            }else{
                mp.put(n,mp.getOrDefault(n,0)+1);
            }
        }
        return count;
    }
}