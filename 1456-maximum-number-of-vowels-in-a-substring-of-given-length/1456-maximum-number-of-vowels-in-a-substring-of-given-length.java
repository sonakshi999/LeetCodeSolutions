class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int count = 0, max = 0;
        for(int i=0;i<k;i++) {
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
        max = count;
        for(int i = k;i<n;i++) {
            if(isVowel(s.charAt(i))) {
               count++;
            }
            if(isVowel(s.charAt(i-k))){
                count--;
            }
            max = Math.max(max,count);
        }
        return max;
    }
    boolean isVowel(char c) {
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return true;
        }
        return false;
    }
}