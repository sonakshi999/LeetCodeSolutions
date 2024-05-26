class Solution {
    public boolean checkRecord(String s) {
        int n = s.length();
        int late = 0, absent = 0;
        
        for(int i=0;i<n;i++) {
            if(s.charAt(i)=='A') {
                absent++;
                late = 0;
            }else if(s.charAt(i)=='L') {
                late++;
            }else if(s.charAt(i)=='P') {
                late=0;
            }
            
            if(late >= 3) {
                return false;
            }
            
            if(absent >= 2) {
                return false;
            }
        }
        return true;
    }
}