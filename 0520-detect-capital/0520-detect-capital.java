class Solution {
    public boolean detectCapitalUse(String word) {
        int c=0;
        for(int i=1;i<word.length();i++) {
            if(word.charAt(i) >= 65 && word.charAt(i) <= 90) {
                for(int j=0;j<i;j++) {
                    if(word.charAt(j) >= 97 && word.charAt(j) <= 122) {
                        c=1;
                    }
                }
            } else if(word.charAt(i) >= 97 && word.charAt(i) <= 122) {
                for(int j=1;j<i;j++) {
                    if(word.charAt(j) >= 65 && word.charAt(j) <= 90) {
                        c=1;
                    }
                }
            }
        }
        return c==0;
    }
}