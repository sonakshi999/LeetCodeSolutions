class Solution {
    Set<Integer> daysToInclude = new HashSet<>();
    public int mincostTickets(int[] days, int[] costs) {
        int dp[] = new int[days[days.length-1]+1];
        Arrays.fill(dp,-1);
        for(int i:days) {
            daysToInclude.add(i);
        }
        return solve(dp,days,costs,days[0]);
    }
    int solve(int[] dp, int[] days, int[] costs, int currDay) {
        if(currDay > days[days.length-1]) {
            return 0;
        }
        if(!daysToInclude.contains(currDay)) {
            return solve(dp,days,costs,currDay+1);
        }
        if(dp[currDay] != -1) {
            return dp[currDay];
        }
        int day1=costs[0]+solve(dp,days,costs,currDay+1);
        int day7=costs[1]+solve(dp,days,costs,currDay+7);
        int day30=costs[2]+solve(dp,days,costs,currDay+30);
        return dp[currDay] = Math.min(day1,Math.min(day7,day30));
    }
}