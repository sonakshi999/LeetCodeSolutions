class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int len = Math.min(len1,len2);
        String ans = new String();
        int j = 0, k = 0;
        for(int i=0;i<(2*len);i++) {
            if(i%2==0) {
                ans = ans + word1.charAt(j++);
            }else {
                ans = ans + word2.charAt(k++);
            }
        }
        while(j < len1) {
            ans = ans + word1.charAt(j++);
            
        }
        while(k < len2) {
            ans = ans + word2.charAt(k++);
        }
        return ans;
    }
}