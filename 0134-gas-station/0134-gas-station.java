class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int cumm[] = new int[n];
        int ans = 0;
        for(int i=0;i<n;i++) {
            cumm[i] = gas[i]-cost[i];
            ans += cumm[i];
        }
        if(ans<0) {
            return -1;
        }
       
        
        for(int i=0;i<n;i++) {
            int start = 0;
            if(cumm[i] >= 0) {
                start = i;
                int curr = cumm[i];
                while(i < n-1 && curr >= 0) { 
                    System.out.println(curr);
                        curr += cumm[i+1];
                     
                        i++;
            
                }
                if(i==n-1) {
                    return start;
                }
            }
        }
        return -1;
    }
}