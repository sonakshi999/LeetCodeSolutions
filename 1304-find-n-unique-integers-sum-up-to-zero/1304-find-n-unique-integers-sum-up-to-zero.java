class Solution {
    public int[] sumZero(int n) {
        int ans[] = new int[n];
        int i = 0, j = n-1;
        while(i < j) {
            ans[i++] = -n;
            ans[j--] = n;
            n--;
        }
        return ans;
    }
}