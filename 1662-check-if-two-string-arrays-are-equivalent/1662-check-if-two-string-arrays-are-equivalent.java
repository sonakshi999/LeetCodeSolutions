class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int n1 = word1.length;
        int n2 = word2.length;
        String s1=null,s2=null;
        for(int i=0;i<n1;i++) {
            s1 = s1+word1[i];
        }
        for(int i=0;i<n2;i++) {
            s2 = s2+word2[i];
        }
        return s1.equals(s2);
    }
}