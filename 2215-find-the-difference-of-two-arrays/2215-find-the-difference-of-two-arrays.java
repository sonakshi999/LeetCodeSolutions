class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> l = myFun(nums1,nums2);
        List<Integer> l1 = myFun(nums2,nums1);
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(l);
        ans.add(l1);
        return ans;
    }
    List<Integer> myFun(int[] n1, int[] n2) {
        Set<Integer> num2 = new HashSet<>();
        for(int n:n2) {
            num2.add(n);
        }
        Set<Integer> ans = new HashSet<>();
        for(int n : n1) {
            if(!num2.contains(n)) {
                ans.add(n);
            }
        }
        return new ArrayList<>(ans);
    }
}