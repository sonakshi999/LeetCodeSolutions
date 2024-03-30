class Solution {
    public int lengthOfLongestSubstring(String s) {
        int first = 0;
        int second = 0;
        int n = s.length();
        int max = 0;
        
        Map<Character, Integer> set = new HashMap<>();
        
        for(int i=0;i<n;i++) {
            if(set.containsKey(s.charAt(i))){
                int pos = set.get(s.charAt(i));
                first = Math.max(first,pos+1);
            }
            set.put(s.charAt(i),i);
            max = Math.max(max,second-first+1);
            second++;
        }
        return max;
    }
}