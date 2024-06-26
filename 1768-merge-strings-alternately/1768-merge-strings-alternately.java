class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int i = 0, j = 0;
        String ans = "";
        while(i<n && j<m) {
            ans = ans + word1.charAt(i++);
            ans = ans + word2.charAt(j++);
        }
        while(i<n){
            ans = ans + word1.charAt(i++);
        }
        while(j<m) {
             ans = ans + word2.charAt(j++);
        }
        return ans;
    }
}