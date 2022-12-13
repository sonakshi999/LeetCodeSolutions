class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;

        if(n==1) return matrix[0][0];
        int[][] arr = new int[n+1][n+2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = Integer.MAX_VALUE;
            arr[i][n + 1] = Integer.MAX_VALUE;
        }
        for(int i=n-1;i>=0;i--){
            for(int j =1;j<=n;j++){
                int curr = matrix[i][j-1];
                int min = Integer.MIN_VALUE;
                min = Math.min(arr[i+1][j], Math.min(arr[i+1][j+1], arr[i+1][j-1]));
                arr[i][j]= curr+min;
            }
        }
        int minSum = Integer.MAX_VALUE;
        for(int i=1;i<=n;i++){
            minSum = Math.min(minSum,arr[0][i]);
        }
        return minSum;
    }
}