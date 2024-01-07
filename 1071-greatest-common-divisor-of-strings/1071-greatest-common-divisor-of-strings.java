class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(str1.equals(str2)){
            return str1;
        }
        int len1 = str1.length();
        int len2 = str2.length();
        int len = gcd(len1,len2);
        if((str1+str2).equals(str2+str1)){
            return str1.substring(0,len);
        }else {
            return "";
        }
    }
    int gcd(int n, int m) {
        if(m>n){
            return gcd(m,n);
        }
        if(m==0) {
            return n;
        }
        return gcd(n-m,m);
    }
}