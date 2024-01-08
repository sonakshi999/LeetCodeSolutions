class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        
        int ans = 0;
        for(int i=0;i<f.length;i++) {
            if(f[i]==0 && (i==0 || f[i-1]==0) &&(i==f.length-1 || f[i+1]==0)){
                ans++;
                f[i]=1;
            }
        }
        return ans>=n;
    }
}



// 0,0,1,1,0,0,0,0