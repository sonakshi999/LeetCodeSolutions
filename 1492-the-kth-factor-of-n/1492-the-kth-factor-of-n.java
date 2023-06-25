class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> facts = new ArrayList<>();
        
        facts.add(1);
        
        for(int i = 2;i<=n/2;i++) {
            if(n%i == 0) {
                facts.add(i);
            }
        }
        
        facts.add(n);
        int sz = facts.size();
        if(sz < k) { return -1; }
        
        int a[] = new int[sz];
        return facts.get(k-1);
        
    }
}