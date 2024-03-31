class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        
        int first = 0;
        int last = 0;
        int max = 0;
        
        int n = s.length();
        for(last=0;last<n;last++) {
            if(map.containsKey(s.charAt(last))){
                int pos = map.get(s.charAt(last));
                first = Math.max(first,pos+1);
            }
            max = Math.max(max,last-first+1);
            map.put(s.charAt(last),last);
        }
        return max;
    }
}