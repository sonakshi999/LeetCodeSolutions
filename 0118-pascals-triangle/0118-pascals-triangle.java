class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i=0;i<numRows;i++) {
            List<Integer> curr = new ArrayList<>();
            if(i==0) {
                curr.add(1);
            }else if(i==1){
                curr.add(1);
                curr.add(1);
            }else{
                curr.add(1);
                for(int j=1;j<i;j++) {
                    curr.add(ans.get(i-1).get(j)+ans.get(i-1).get(j-1));
                }
                curr.add(1);
            }
            ans.add(curr);
        }
        return ans;
    }
}