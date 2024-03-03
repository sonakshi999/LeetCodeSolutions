class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        
        for(int i=0;i<nums.length;i++) {
            Set<Integer> l = new HashSet<>();
            for(int j=i+1;j<nums.length;j++) {
                if(l.contains(-(nums[i]+nums[j]))){
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],-(nums[i]+nums[j]));  
                    temp.sort(null);
                    ans.add(temp);
                }
                l.add(nums[j]);
            }
        }
       List<List<Integer>> f = new ArrayList<>(ans);
       return f;
    }
}
                               