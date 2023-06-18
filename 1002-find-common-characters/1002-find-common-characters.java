class Solution {
    public List<String> commonChars(String[] words) {
        Map<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<words[0].length();i++) {
            char c = words[0].charAt(i);
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        
        for(int i=1;i<words.length;i++) {
            Map<Character,Integer> tmp = new HashMap<>();
            String curr = words[i];
            for(int j=0;j<curr.length();j++) {
                char c = curr.charAt(j);
                if(mp.containsKey(c)) {
                    Integer freq = tmp.get(c);
                    tmp.put(c, Math.min(mp.get(c), (freq == null ? 1 : freq+1)));
                }
            }
            mp = tmp;
        }
        
        List<String> ans = new ArrayList<>();
        for(char c : mp.keySet()) {
            for(int i=0;i<mp.get(c);i++) {
                ans.add(String.valueOf(c));
            }
        }
        return ans;
    }
}