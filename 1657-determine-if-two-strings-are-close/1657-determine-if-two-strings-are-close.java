class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.equals(word2)) return true;
        int a[] = new int[26];
        int b[] = new int[26];
        int n = word1.length();
        int m = word2.length();
        if(n != m) return false;
        for(int i=0;i<n;i++) {
            a[word1.charAt(i)-'a']++;
        }
        for(int i=0;i<m;i++) {
            b[word2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++) {
            if((a[i]==0 && b[i]!=0) || (a[i]!=0 && b[i]==0)) {
                return false;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<26;i++) {
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
}