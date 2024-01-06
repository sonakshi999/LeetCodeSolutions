class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int len = Math.min(len1,len2);
        String ans = new String();
        
        for(int i=0;i<len;i++) {
            ans += word1.charAt(i);
            ans += word2.charAt(i);
        }
        if(len < len1) {
            ans = ans + word1.substring(len,len1);
            
        }
        if (len < len2) {
            ans = ans + word2.substring(len,len2);
        }
        return ans;
    }
}