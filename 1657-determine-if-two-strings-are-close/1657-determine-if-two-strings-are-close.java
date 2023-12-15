class Solution {
    public boolean closeStrings(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        if(n1 != n2) {
            return false;
        }
        Map<Character,Integer> m1 = new HashMap<>();
        Map<Character,Integer> m2 = new HashMap<>();
        for(int i=0;i<n1;i++) {
            m1.put(word1.charAt(i),m1.getOrDefault(word1.charAt(i),0)+1);
        }
       
        for(int i=0;i<n2;i++) {
            m2.put(word2.charAt(i),m2.getOrDefault(word2.charAt(i),0)+1);
        }
        Set<Character> s1 = new HashSet<>(m1.keySet());
        Set<Character> s2 = new HashSet<>(m2.keySet());
        List<Integer> f1 = new ArrayList<>(m1.values());
        List<Integer> f2 = new ArrayList<>(m2.values());
        Collections.sort(f1);
        Collections.sort(f2);
        return (s1.equals(s2) && f1.equals(f2));
    }
}