class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = rocks.length;
        int diff[] = new int[n];
        for(int i=0;i<n;i++) {
            diff[i] = capacity[i]-rocks[i];
        }
        Arrays.sort(diff);
        int step = 0;
        for(int i : diff) {
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