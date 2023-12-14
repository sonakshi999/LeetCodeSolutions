class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int n : arr) {
            mp.put(n,mp.getOrDefault(n,0)+1);
        }
        return mp.size() == new HashSet<>(mp.values()).size();
    }
}