class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        if(rowIndex == 0) {
            return l;
        }
        for(int i=1;i<=rowIndex;i++) {
            List<Integer> temp = new ArrayList<>();
            for(int j=0;j<=i;j++) {
                if(j==0 || j==i) {
                    temp.add(1);
                }else{
                    temp.add(l.get(j)+l.get(j-1));
                }
            }
            l = temp;
        }
        return l;
    }
}