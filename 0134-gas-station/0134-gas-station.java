class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasT=0,costT=0;
        for(int i=0;i<gas.length;i++) {
            gasT += gas[i];
            costT += cost[i];
        }
        if(gasT<costT) {
            return -1;
        }
        int start = 0;
        int tankMePetrol = 0;
        for(int i=0;i<gas.length;i++) {
            tankMePetrol += gas[i];
            tankMePetrol -= cost[i];
            if(tankMePetrol<0) {
                start=i+1;
                tankMePetrol = 0;
            }
        }
        return start;
    }
}