class Solution {
    public boolean halvesAreAlike(String s) {
        Character arr[] = {'a','e','i','o','u','A','E','I','O','U'};
        Set<Character> set = new HashSet<>(Arrays.asList(arr));
        int n = s.length();
        int mid = n/2;
        int a = 0, b = 0;
        for(int i=0;i<mid;i++) {
            char c = s.charAt(i);
            char d = s.charAt(mid+i);
            if(set.contains(c)) a++;
            if(set.contains(d)) a--;
        }
        return a==0;
    }
}