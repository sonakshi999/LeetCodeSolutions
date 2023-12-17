class Solution {
    HashSet<Integer> isTravelNeeded = new HashSet<>();
    public int mincostTickets(int[] days, int[] costs) {
        int lastDay = days[days.length - 1];
        int dp[] = new int[lastDay + 1];
        Arrays.fill(dp, -1);

        // Mark the days on which we need to travel.
        for (int day : days) {
            isTravelNeeded.add(day);
        }
       
        return solve(days[0],days,costs,dp);
    }
    int solve(int currDay, int[] days , int[] costs, int[] dp) {
        if (currDay > days[days.length - 1]) {
            return 0;
        }
        if(!isTravelNeeded.contains(currDay)){
            return solve(currDay+1,days,costs,dp);
        }
        if(dp[currDay] != -1){
            return dp[currDay];
        }
        int oneDay = costs[0] + solve(currDay+1,days,costs,dp);
        int sevenDay = costs[1] + solve(currDay+7,days,costs,dp);
        int thirtyDay = costs[2] + solve(currDay+30,days,costs,dp);
        return dp[currDay] = Math.min(oneDay,Math.min(sevenDay,thirtyDay));
    }
}