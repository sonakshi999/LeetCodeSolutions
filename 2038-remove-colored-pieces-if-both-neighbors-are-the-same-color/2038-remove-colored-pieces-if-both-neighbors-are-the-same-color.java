class Solution {
    public boolean winnerOfGame(String colors) {
        if(colors.length() <= 2) { 
            return false;
        }
        int a = 0, b = 0;
        for(int i=0;i<colors.length();i++) {
            char c = colors.charAt(i);
            int count = 1;
            if(c == 'A') {
                for(int j=i+1;j<colors.length();j++) {
                    if(colors.charAt(j) == c) {
                        count++;
                        i++;
                    }else{
                        break;
                    }
                }
                if(count>=3) {
                    a = a + count-2;
                }
            }
        }
        for(int i=0;i<colors.length();i++) {
            char c = colors.charAt(i);
            int count = 1;
            if(c == 'B') {
                for(int j=i+1;j<colors.length();j++) {
                    if(colors.charAt(j) == c) {
                        count++;
                        i++;
                    }else{
                        break;
                    }
                }
                if(count>=3) {
                    b = b + count-2;
                }
            }
        }
        System.out.println(a+" "+b);
        if(a>b) {
            return true;
        }
        return false;
    }
}