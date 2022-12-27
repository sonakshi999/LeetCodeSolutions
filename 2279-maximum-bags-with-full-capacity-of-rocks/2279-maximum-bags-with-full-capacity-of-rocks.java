class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = rocks.length;
        for(int i=0;i<n;i++) {
            rocks[i] = capacity[i]-rocks[i];
        }
        Arrays.sort(rocks);
        int step = 0;
        for(int i : rocks) {
            if(additionalRocks >= i) {
                step++;
                additionalRocks -= i;
            } else {
                break;
            }
        }
        return step;
    }
}