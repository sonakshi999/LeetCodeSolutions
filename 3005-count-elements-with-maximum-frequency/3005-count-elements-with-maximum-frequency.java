class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int n : nums){
            mp.put(n,mp.getOrDefault(n,0)+1);
        }
        int max = 0;
        int sum = 0;
        for(int n:mp.values()){
            if(n>max){
                max = n;
                sum = n;
            }else if(n==max){
                sum += n;
            }
        }
        return sum;
    }
}