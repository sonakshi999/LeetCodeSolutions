class Solution {
    public int lengthOfLastWord(String s) {
        
        int len = 0;
        s=s.trim();
        int n = s.length();
        
        for(int i=n-1;i>=0;i--) {
            if(s.charAt(i)==' '){
                return len;
            }else{
                len++;
            }
        }
        return len;
    }
}