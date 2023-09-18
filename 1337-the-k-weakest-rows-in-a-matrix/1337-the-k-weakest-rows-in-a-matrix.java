class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int r = mat.length;
        int c = mat[0].length;
        int count[] = new int[r];
        for(int i=0;i<r;i++) {
            int temp = 0;
            for(int j=0;j<c;j++) {
                if(mat[i][j] == 1) {
                    temp++;
                }else if(mat[i][j] == 0) {
                    continue;
                }
            }
            count[i] = temp;
        }
        int ab[][] = new int[r][r];
        for(int i=0;i<r;i++) {
            ab[i][0]=count[i];
            ab[i][1]=i;
        }
        Arrays.sort(ab, (x,y) -> x[0]==y[0] ? x[1]-y[1] : x[0]-y[0]);
        int ans[] = new int[k];
        for(int i=0;i<k;i++) {
            ans[i] = ab[i][1];
        }
        return ans;
    }
}