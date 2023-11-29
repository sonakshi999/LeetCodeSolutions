class Solution {
    public boolean canPlaceFlowers(int[] fb, int n) {
        int count = 0;
        for(int i=0;i<fb.length;i++) {
            if(fb[i]==0) {
                if((i-1) >= 0 && (i+1) <=fb.length-1){
                    if(fb[i-1]==0 && fb[i+1]==0) {
                        count++;
                        fb[i]=1;
                    }
                    
                }else if((i-1)<0 && (i+1) <=fb.length-1){
                    if(fb[i+1]==0){
                        count++;
                        fb[i]=1;
                    }
                    
                }else if((i-1) >= 0 && (i+1) > fb.length-1) {
                    if(fb[i-1]==0){
                        count++;
                        fb[i]=1;
                    }
                }else if(i-1<0 && i+1 >fb.length-1){
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