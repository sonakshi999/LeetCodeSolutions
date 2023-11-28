class Solution {
    public String mergeAlternately(String word1, String word2) {

        int len1 = word1.length();
        int len2 = word2.length();
        int len = Math.min(len1,len2);
        StringBuffer sb = new StringBuffer();
        for(int i = 0 ; i < len ; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        if(len1 > len2) {
            sb.append(word1.substring(len,len1));
        } 
        if(len2 > len1) {
             sb.append(word2.substring(len, len2));
        }
         return new String(sb);
    }
}