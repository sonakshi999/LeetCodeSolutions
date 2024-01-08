class Solution {
    public String reverseVowels(String s) {
        Set<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        int i = 0, j = s.length()-1;
        char[] c = s.toCharArray();
        while(i<j) {
            if(set.contains(c[i]) && set.contains(c[j])) {
                swap(c,i,j);
                i++;
                j--;
                
            }
            if(!set.contains(c[i])){
                i++;
            }
            if(!set.contains(c[j])) {
                j--;
            }
        }
        return new String(c);
    }
    void swap(char[] c,int i,int j) {
        
        char temp = c[i];
        c[i]=c[j];
        c[j]=temp;
        
    }
}