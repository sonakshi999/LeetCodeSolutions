class Solution {
    public char findTheDifference(String s, String t) {
        boolean ss[] = new boolean[s.length()];
        for(int i=0;i<t.length();i++) {
            char c = t.charAt(i);
            boolean flag = false;
            for(int j=0;j<s.length();j++) {
               
                if(c == s.charAt(j) && ss[j] == false) {
                    
                    flag = true;
                    ss[j] = true;
                    break;
                }
            }
            if(flag == false) {
                return c;
            }
        }
        return 'p';
    }
}