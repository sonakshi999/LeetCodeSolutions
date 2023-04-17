class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        int n = candies.length;
        List<Boolean> ans = new ArrayList<>();
        for(int i=0;i<n;i++) {
            if((candies[i]+extraCandies) >= max) {
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
    }
}