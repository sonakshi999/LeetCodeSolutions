class Solution {
    public int minDeletions(String ss) {
        Map<Character,Integer> mp = new HashMap<>();
        int n = ss.length();
        
        for(int i=0;i<n;i++) {
            char ch = ss.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        Set<Integer> s = new HashSet<>();
        int ans = 0;
        for(char c : mp.keySet()){
            int freq = mp.get(c);
            if(!s.contains(freq)){
                s.add(freq);
            }else{
                while(freq >0 && s.contains(freq)) {
                    ans++;
                    freq--;
                }
                if(freq>0){s.add(freq);}
            }
        }
        
        return ans;
    }
}