class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int n : nums){
            mp.put(n,mp.getOrDefault(n,0)+1);
        }
        int max = 0;
        for(int n:mp.values()){
            if(n>max){
                max = n;
            }
        }
        int sum = 0;
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            if(entry.getValue()==max){
                sum += entry.getValue();
            }
        }
        return sum;
    }
}