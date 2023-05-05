class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowel = Set.of('a','e','i','o','u');
        int count = 0;
        for(int i=0;i<k;i++) {
            char c = s.charAt(i);
            count += vowel.contains(c)? 1 : 0;
        }
        int ans = count; // as count will be diff in each window this variable will keep track of maximum count;
        
        for(int i=k;i<s.length();i++) {
            char c = s.charAt(i);
            char kk = s.charAt(i-k);
            count += vowel.contains(c)? 1 : 0;
            count -= vowel.contains(kk)? 1 : 0;
            ans = Math.max(count,ans);
        }
        return ans;
    }
}