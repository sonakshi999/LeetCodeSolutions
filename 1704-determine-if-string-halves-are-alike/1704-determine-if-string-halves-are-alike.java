class Solution {
    public boolean halvesAreAlike(String s) {
        List<Character> l = Arrays.asList('a','e','i','o','u');
        int count1=0,count2=0;
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++) {
            if(i<s.length()/2) {
                if(l.contains(s.charAt(i))){
                    count1++;
                }
            }else{
                if(l.contains(s.charAt(i))){
                    count2++;
                }
            }
        }
        return count1==count2;
    }
}