class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for(int i=0;i<nums1.length;i++) {
            s1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++) {
            s2.add(nums2[i]);
        }
        List<List<Integer>> ans = new ArrayList<>();
        
        List<Integer> ans1 = new ArrayList<>();
        List<Integer> ans2 = new ArrayList<>();
        
        for(int i:nums1) {
            if(!s2.contains(i)){
                if(!ans1.contains(i))
                  ans1.add(i);
            }
        }
        for(int i:nums2) {
            if(!s1.contains(i)){
                if(!ans2.contains(i))
                  ans2.add(i);
            }
        }
        ans.add(ans1);
        ans.add(ans2);
        return ans;
    }
}