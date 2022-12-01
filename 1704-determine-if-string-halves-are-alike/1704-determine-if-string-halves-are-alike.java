class Solution {
    public boolean halvesAreAlike(String s) {
        Character arr[] = {'a','e','i','o','u','A','E','I','O','U'};
        Set<Character> set = new HashSet<>(Arrays.asList(arr));
        int n = s.length();
        int a = 0, b = 0;
        for(int i=0;i<n/2;i++) {
            char c = s.charAt(i);
            if(set.contains(c)) {
                a++;
            }
        }
        for(int i=n/2;i<n;i++) {
            char c = s.charAt(i);
            if(set.contains(c)) {
                b++;
            }
        }
        return a==b;
    }
}