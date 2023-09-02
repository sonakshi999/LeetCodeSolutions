class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        Set<String> set = new HashSet<>();
        for(String st:dictionary) {
            set.add(st);
        }
        int[] dp = new int[s.length()+1];
        Arrays.fill(dp,-1);
        return f(0,s,set,dp);
    }
    int f(int index, String s, Set<String> set, int[] dp) {
        //base condition
        if(index>=s.length()){ return 0; }
        //already computed
        if(dp[index] != -1) { return dp[index]; }
        
        String curr = "";
        int res = s.length();
        
        for(int i=index;i<s.length();i++) {
            curr = curr + String.valueOf(s.charAt(i));
            int extraCount = curr.length();
            if(set.contains(curr)) {
                extraCount = 0;
            }
            extraCount += f(i+1,s,set,dp);
            res = Math.min(res,extraCount);
        }
        dp[index]=res;
        return res;
    }
}