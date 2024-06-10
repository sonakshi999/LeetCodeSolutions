class Solution {
    public boolean isIdealPermutation(int[] nums) {
        int n = nums.length;
        int glo = 0, loc = 0;
        
        for(int i=0;i<n-1;i++) {
            if(nums[i] > nums[i+1]) {
                loc++;
            }
        }
        
       glo = mergeSort(nums,0,n-1);
       return glo==loc;
    }
    int mergeSort(int[] nums, int st, int end) {
        int cnt = 0;
        if(st >= end) return cnt;
        
        int mid = st + (end-st)/2;
        
        cnt+=mergeSort(nums,st,mid);
        cnt+=mergeSort(nums,mid+1,end);
        cnt+=merge(nums,st,mid,end);
        return cnt;
    }
    int merge(int[] nums,int st,int mid,int end) {
        int cnt = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        int j = mid+1;
        int start = st;
        while(start<=mid && j<=end){
            if(nums[start] <= nums[j]) {
                temp.add(nums[start]);
                start++;
            }else {
                cnt += mid+1-start;
                temp.add(nums[j]);
                j++;
            }
        }
        while(start<=mid) {
            temp.add(nums[start]);
            start++;
        }
        while(j<=end) {
            temp.add(nums[j]);
            j++;
        }
        
        for(int i = st;i<=end;i++) {
            nums[i]=temp.get(i-st);
        }
        return cnt;
        
    }
}