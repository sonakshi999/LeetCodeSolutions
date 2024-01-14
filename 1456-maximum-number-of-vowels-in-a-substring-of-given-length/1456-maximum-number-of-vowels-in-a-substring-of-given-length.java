class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        int n = s.length();
        int count = 0, max = 0, i = 0;
        for(i=0;i<k;i++) {
            if(set.contains(s.charAt(i))){
                count++;
            }
        }
        max = count;
        for(i=k;i<n;i++) {
            if(set.contains(s.charAt(i))){
                count++;
            }
            if(set.contains(s.charAt(i-k))){
                count--;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}