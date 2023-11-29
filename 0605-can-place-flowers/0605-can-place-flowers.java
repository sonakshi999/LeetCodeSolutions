class Solution {
    public boolean canPlaceFlowers(int[] fb, int n) {
        int count = 0;
        for(int i=0;i<fb.length;i++) {
            if(fb[i]==0) {
               boolean left = ((i-1)==-1 || fb[i-1]==0);
               boolean right = ((i+1)==fb.length || fb[i+1]==0);
               if(left && right) {
                   count++;
                   fb[i]=1;
               }
            }
        }
        return n<=count;
    }
}


// [0,0,1] [1,0,0,0,1]  [1,0,0]
// [0,0,0,0,1] [1,0,0,0,0,0,1]