class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        Map<String,Integer> m1 = new HashMap<>();
        Map<String,Integer> m2 = new HashMap<>();
        for(int i=0;i<n;i++) {
            String curr="";
            for(int j=0;j<n;j++) {
                curr += String.valueOf(grid[i][j]);
                curr+=",";
            }
            m1.put(curr, m1.getOrDefault(curr,0)+1);
        }
        for(int i=0;i<n;i++) {
            String curr="";
            for(int j=0;j<n;j++) {
                curr += String.valueOf(grid[j][i]);
                curr+=",";
            }
            m2.put(curr, m2.getOrDefault(curr,0)+1);
        }
        System.out.println(m1+" "+m2);
        int ans = 0;
        for(String s : m1.keySet()) {
            if(m2.containsKey(s)) {
                ans += m1.get(s)*m2.get(s);
            }
        }
        return ans;
    }
}