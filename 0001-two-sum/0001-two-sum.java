class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int curr = nums[i];
            if(hm.containsKey(target-curr)){
                int[] ans = {hm.get(target-curr),i};
                return ans;
            }
            hm.put(curr,i);
        }
        return new int[]{0};
    }
}