class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        
        int n = happiness.length;
        int index = n-1;
        Arrays.sort(happiness);
        
        int counter = 0;
        long sum = 0;
        
        for(int i=0;i<k;i++) {
            happiness[index] -= counter;
            if(happiness[index]>0){
                sum += happiness[index];
            }
            
            index--;
            counter++;
        }
        return sum;
    }
}