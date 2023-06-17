class Solution {
    public int minDeletions(String s) {
        Map<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        
        Set<Integer> ans = new HashSet<>();
        int res = 0;
        
        for(char c : mp.keySet()) {
            int i = mp.get(c);
            if(!ans.contains(i)){
                ans.add(i);
            }else{
                while(ans.contains(i) && i>0) {
                    res++;
                    i--;
                }
                if(i>0) {
                    ans.add(i);
                }
            }
        }
        return res;
        
    }
}