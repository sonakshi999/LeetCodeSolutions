class Solution {
    public boolean isSubsequence(String s, String t) {

        int n=t.length();
        int j=0;
        int m=s.length();
        if(m==0) return true;
        for(int i=0;i<n;i++){
            char c=t.charAt(i);
            if(j<m && c==s.charAt(j)){
                j++;
            }
        }
        return (j==m);
    }
}