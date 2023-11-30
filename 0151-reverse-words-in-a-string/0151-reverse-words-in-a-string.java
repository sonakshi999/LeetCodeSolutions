class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        int start = 0;
        int end = words.length-1;
        while(start<end) {
            String temp = words[start];
            words[start++] = words[end];
            words[end--] = temp;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<words.length;i++) {
            sb.append(words[i]+" ");
        }
        return new String(sb).trim();
    }
}