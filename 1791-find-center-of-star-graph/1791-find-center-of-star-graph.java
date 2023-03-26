class Solution {
    public int findCenter(int[][] edges) {
        int a = edges[0][0];
        int b = edges[0][1];
        int c = edges[1][0];
        int d = edges[1][1];
        Set<Integer> s = new HashSet<>();
        s.add(a);
        s.add(b);
        if(s.contains(c)) {
            return c;
        }
        return d;
    }
}