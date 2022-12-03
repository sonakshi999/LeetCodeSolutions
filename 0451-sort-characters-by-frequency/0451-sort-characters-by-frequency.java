class Solution {
    public String frequencySort(String s) {
       Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        Queue<Character> pq = new PriorityQueue<>((a,b) -> (map.get(b)-map.get(a)));
        for(char ch: map.keySet()) {
            pq.add(ch);
        }
        System.out.println(map+ " "+pq);
        
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()) {
            char ch = pq.peek();
            int count = map.get(pq.poll());
            while(count-- > 0) {
                sb.append(ch);
            }
        }
        
        return sb.toString();
    }
}