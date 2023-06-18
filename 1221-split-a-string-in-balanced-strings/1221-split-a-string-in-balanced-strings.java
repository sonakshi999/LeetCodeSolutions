class Solution {
    public int balancedStringSplit(String s) {
       int r, l,count;
        r=l=count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R') r++;
            else l++;

            if(r==l) {
                count++;
                r=l=0;
            }
        }
        return count;
    }
}