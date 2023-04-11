class Solution {
    public String removeStars(String s) {
        int n = s.length();
        Stack<Character> sc = new Stack<>();
        for(int i=0;i<n;i++) {
            char ch = s.charAt(i);
            if(ch == '*') {
                sc.pop();
            }else{
                sc.push(ch);
            }
        }
        if(sc.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while(!sc.isEmpty()){
            sb.append(sc.pop());
        }
        return sb.reverse().toString();
    }
}