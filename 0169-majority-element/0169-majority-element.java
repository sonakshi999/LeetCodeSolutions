class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int n : nums){
            mp.put(n, mp.getOrDefault(n,0)+1);
        }
        int max = 0;
        int ans = 0;
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()) {
            int val = entry.getValue();
            if(val>max){
                max = val;
                ans = entry.getKey();
            }
        }
        return ans;
    }
}