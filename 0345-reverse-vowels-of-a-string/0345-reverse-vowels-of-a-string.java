class Solution {
    public String reverseVowels(String s) {
        char[] c=s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        while(start < end) {
            if(isVowel(s.charAt(start)) && isVowel(s.charAt(end))) {
                swap(c,start,end);
                start++;
                end--;
            }
            if(!isVowel(s.charAt(start))){
                start++;
            }
            if(!isVowel(s.charAt(end))){
                end--;
            }
        }
        return new String(c);
    }
    boolean isVowel(char c) {
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
            return true;
        }
        return false;
    }
    void swap(char[] c,int a, int b){
        char temp = c[a];
        c[a] = c[b];
        c[b] = temp;
    }
    
}