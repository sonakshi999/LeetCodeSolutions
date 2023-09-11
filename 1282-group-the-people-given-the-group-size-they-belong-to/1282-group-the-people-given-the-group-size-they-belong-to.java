class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int n = groupSizes.length;
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer,List<Integer>> mp = new HashMap<>();
        for(int i=0;i<n;i++) {
            if(!mp.containsKey(groupSizes[i])) {
                mp.put(groupSizes[i],new ArrayList<>());
            }
            List<Integer> group = mp.get(groupSizes[i]);
            group.add(i);
            if(group.size() == groupSizes[i]) {
                ans.add(group);
                mp.remove(groupSizes[i]);
            }
        }
        return ans;
    }
}