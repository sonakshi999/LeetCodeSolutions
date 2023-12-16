class Solution {
    public String removeStars(String s) {
        Stack<Character> sc = new Stack<>();
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(c=='*'){
                sc.pop();
            }else{
                sc.add(c);
            }
        }
        if(sc.isEmpty()){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while(!sc.isEmpty()) { 
            sb.insert(0,sc.pop());
        }
        return sb.toString();
    }
}