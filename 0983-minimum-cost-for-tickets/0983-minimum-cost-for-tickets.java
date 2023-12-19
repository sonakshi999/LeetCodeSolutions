class Solution {
    Set<Integer> set = new HashSet<>();
    public int mincostTickets(int[] days, int[] costs) {
        int dp[] = new int[days[days.length-1]+1];
        Arrays.fill(dp,-1);
        for(int d:days) {
            set.add(d);
        }
        return solve(days[0],dp,days,costs);
    }
    int solve(int currDay,int[] dp,int[] days,int[] costs) {
        if(currDay > days[days.length-1]) {
            return 0;
        }
        if(!set.contains(currDay)) {
            return solve(currDay+1,dp,days,costs);
        }
        if(dp[currDay] != -1){
            return dp[currDay];
        }
        int c1 = costs[0]+solve(currDay+1,dp,days,costs);
        int c2 = costs[1]+solve(currDay+7,dp,days,costs);
        int c3 = costs[2]+solve(currDay+30,dp,days,costs);
        return dp[currDay] = Math.min(c1,Math.min(c2,c3));
    }
}