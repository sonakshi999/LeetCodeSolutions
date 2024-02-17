class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        
        for(int n : arr) {
            mp.put(n,mp.getOrDefault(n,0)+1);
        }
        
        List<Map.Entry<Integer, Integer> > list
            = new LinkedList<Map.Entry<Integer, Integer> >(
                mp.entrySet());
 
        // Sort the list using lambda expression
        Collections.sort(
            list,
            (i1,
             i2) -> i1.getValue().compareTo(i2.getValue()));
 
        // put data from sorted list to hashmap
        HashMap<Integer, Integer> temp
            = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        int ans = temp.size();
        
        for(Map.Entry<Integer,Integer> map : temp.entrySet()) {
            int n = map.getValue();
            k = k-n;
            if(k<0) {
                break;
            }else if(k==0){
                ans--;
                break;
            }
            ans--;
        }
        return ans;
    }
}