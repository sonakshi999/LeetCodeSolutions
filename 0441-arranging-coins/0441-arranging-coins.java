class Solution {
    public int arrangeCoins(int n) {
        int stairs = 0;
        int step = 1;
        while(n >= step){
            n = n-step;
            step++;
            stairs++;
        }
        return stairs;
    }
}