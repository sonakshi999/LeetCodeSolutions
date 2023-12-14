class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int n : arr) {
            mp.put(n,mp.getOrDefault(n,0)+1);
        }
        Set<Integer> ss = new HashSet<>();
        for(Integer value : mp.values()) {
            if(ss.contains(value)){
                return false;
            }
            ss.add(value);
        }
        return true;
    }
}