class Solution {
    public int partitionString(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int count = 1;
        for(int i=0;i<n;i++) {
            char ch = s.charAt(i);
            if(set.contains(ch)){
                count++;
                set.clear();
            }
            set.add(ch);
        }
        return count;
    }
}