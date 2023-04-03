class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length;
        
        int ans = 0;
        for(int i=0;i<n;i++) {
            if(people[i]+people[n-1] <= limit) {
                ans++;
                n=n-1;
            }else {
                n=n-1;
                ans++;
                i--;
            }
        }
        return ans;
    }
}