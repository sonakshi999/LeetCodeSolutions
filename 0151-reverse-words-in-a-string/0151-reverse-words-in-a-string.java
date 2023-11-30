class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        for(int i=0;i<words.length/2;i++) {
            String temp = words[i];
            words[i]=words[words.length-i-1];
            words[words.length-i-1]=temp;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<words.length;i++) {
            sb.append(words[i]);
            if(i!=words.length-1){
                sb.append(" ");
            }
        }
        return new String(sb).trim();
    }
}