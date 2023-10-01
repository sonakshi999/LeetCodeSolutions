class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for(String str:arr) {
            String st = reverse(str);
            sb.append(st);
            sb.append(" ");
        }
        //sb.trim();
        return new String(sb).trim();
    }
    String reverse(String s) {
        StringBuffer sb = new StringBuffer();
        for(int i=s.length()-1;i>=0;i--) {
            sb.append(s.charAt(i));
        }
        return new String(sb);
    }
}