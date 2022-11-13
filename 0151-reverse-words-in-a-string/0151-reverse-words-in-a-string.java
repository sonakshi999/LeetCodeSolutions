class Solution {
    public String reverseWords(String s) {
        String arr[] = s.split("\\s+");
        int n = arr.length;
        int start = 0, end = n-1;
        while(start <= end) {
            String temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<n;i++) {
            sb.append(arr[i]+" ");
        }
        return new String(sb).trim();
    }
}