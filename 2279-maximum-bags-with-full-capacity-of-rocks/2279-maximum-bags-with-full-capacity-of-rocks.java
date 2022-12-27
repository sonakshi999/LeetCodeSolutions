class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = rocks.length;
        int ans = 0;
        ArrayList<Integer> diff = new ArrayList<>();
        for(int i=0;i<n;i++) {
            if(rocks[i]==capacity[i]) {
                ans++;
            } else {
                diff.add(capacity[i]-rocks[i]);
            }
        }
        int arr[] = new int[diff.size()];
        for(int i=0;i<diff.size();i++) {
            arr[i] = diff.get(i);
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++) {
            if(additionalRocks >= arr[i]) {
                ans++;
                additionalRocks -= arr[i];
            }
        }
        return ans;
    }
}