class Solution {
    public int findDuplicate(int[] nums) {
        /*int n = nums.length;
        // s- sn
        // s2 - sn2
        long sn = n*(n+1)/2;
        long sn2 = n*(n+1)*(2*n+1)/6;
        
        long s = 0;
        long s2 = 0;
        for(int i=0;i<n;i++) {
            s += nums[i];
            s2 += nums[i]*nums[i];
        }
        long doubleMnot = s-sn;
        long double2Mnot2 = s2 - sn2;
        long xPy = double2Mnot2 / doubleMnot;
        long xMy = doubleMnot;
        long ans = (xPy + xMy)/2;
        return (int) ans;*/
        int n = nums.length;
        int a[] = new int[n+1];
        
        for(int i=0;i<n;i++) {
            a[nums[i]]++;
        }
        for(int i=1;i<=n;i++) {
            if(a[i] > 1) {
                return i;
            }
        }
        return 0;
    }
}