class Solution {
    public boolean wordPattern(String pattern, String s) {
        String a[] = s.split(" ");
        int n = pattern.length();
        int m = a.length;
        if(n != m) return false;
        Map<Character,String> cw = new HashMap<>();
        Map<String,Character> wc = new HashMap<>();
        
        for(int i=0;i<n;i++) {
            char c = pattern.charAt(i);
            String w = a[i];
            if(!cw.containsKey(c)) {
                cw.put(c,w);
            }
            if(!wc.containsKey(w)) {
                wc.put(w,c);
            }
            if(!cw.get(c).equals(w) || !wc.get(w).equals(c)) {
                return false;
            }
        }
        return true;
    }
}