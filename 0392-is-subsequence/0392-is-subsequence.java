class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int pos1=0, pos2=0;
        while(pos1<s.length() && pos2<t.length()){
            if(s.charAt(pos1) != t.charAt(pos2)){
                pos2++;
            }else {
                pos1++;
                pos2++;
            }
        }
        return pos1 == s.length();
    }
}