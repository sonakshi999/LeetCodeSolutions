class Solution {
    public int compress(char[] chars) {
        
        int n = chars.length;
        if(n<=1) {
            return n;
        }
        List<Character> l = new ArrayList<>();
        for(int i=0;i<n;) {
            char curr = chars[i];
            int j = i+1;
            int count = 1;
            while(j<n && chars[j]==curr) {
                count++;
                j++;
            }
            l.add(curr);
            if(count > 1) {
                String numberAsString = String.valueOf(count); 
                char[] cha = numberAsString.toCharArray();
                for(char c : cha) {
                    l.add(c);
                }
            }
            i = j;
        }
        int sz=l.size();
        for(int i=0;i<sz;i++) {
            chars[i] = l.get(i);
        }
        return sz;
    }
}