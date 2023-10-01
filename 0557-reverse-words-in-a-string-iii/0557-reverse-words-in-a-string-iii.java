class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String word:words) {
            int len=word.length();
            int st=0;
            String ww=reverse(word,st,len-1);
            sb.append(ww);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
    public String reverse(String s,int start,int end) {
        char[] c=s.toCharArray();
        while(start<end) {
            char cc=c[start];
            c[start]=c[end];
            c[end]=cc;
            start++;
            end--;
        }
        return new String(c);
    }
}