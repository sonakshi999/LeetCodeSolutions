class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n != 1  && !set.contains(n)) {
            set.add(n);
            if(n>10) {
                int curr = 0;
                while(n>1){
                    int temp = n% 10;
                    n = n/10;
                    curr += temp*temp;
                }
                System.out.print(n+"  n ");
                n = curr + n*n;
                System.out.print(n+"p ");
            }else{
                n = n*n;
                System.out.print(n+"s ");
            }
        }
        return n==1;
    }
}