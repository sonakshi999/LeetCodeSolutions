class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int n : arr) {
            mp.put(n,mp.getOrDefault(n,0)+1);
        }
        System.out.println(mp);
        Set<Integer> ss = new HashSet<>();
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()) {
            if(ss.contains(entry.getValue())){
                return false;
            }
            ss.add(entry.getValue());
        }
        return true;
    }
}