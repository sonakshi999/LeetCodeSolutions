class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        
        Stack<Character> sc = new Stack<>();
        
        for(int i=0;i<n;i++) {
            char ch = s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[') {
                sc.add(ch);
                continue;
            } 
            if(sc.isEmpty()) {
                return false;
            }
            if(ch==')'){
                if(sc.peek() != '(') {
                    return false;
                }
                sc.pop();
                continue;
                
            } else if(ch=='}') {
                if(sc.peek() != '{') {
                    return false;
                }
                sc.pop();
                continue;
                
                
            } else {
                if(sc.peek() != '[') {
                    return false;
                }
                sc.pop();
            }
        }
        if(sc.isEmpty()){
            return true;
        }
        return false;
    }
}