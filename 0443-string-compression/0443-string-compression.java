class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        List<Character> list = new ArrayList<>();
        for(int i=0;i<n;i++) {
            list.add(chars[i]);
            int count = 1;
            int j = i+1;
            while(j<chars.length && chars[i]==chars[j]){
                count++;
                j++;
            }
            if(count>1) {
                String s = String.valueOf(count);
                char ch[] = s.toCharArray();
                for(int ii=0;ii<ch.length;ii++) {
                    list.add(ch[ii]);
                }
            }
            i = j-1;
        }
        int len = list.size();
        for(int i=0;i<len;i++) {
            chars[i]=list.get(i);
        }
        return len;
    }
}