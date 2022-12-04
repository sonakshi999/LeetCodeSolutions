class Solution {
    public int edgeScore(int[] edges) {
        int n = edges.length;
        long sc[] = new long[n];
        Arrays.fill(sc,0);
        for(int i=0;i<n;i++) {
            int j = edges[i];
            sc[j] += i;
        }
        for(int i=0;i<n;i++) {
            System.out.print(sc[i]+ " ");
        }
        long max = 0;
        int ans = 0;
        for(int i=0;i<n;i++) {
            if(sc[i]>max) {
                max = sc[i];
                ans = i;
            }
        }
        return ans;
    }
}