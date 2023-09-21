class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int n = nums1.length;
    int m = nums2.length;
    if (m < n) return findMedianSortedArrays(nums2, nums1);
    int start1=0,end1=n;
    while(start1<=end1){
        int i1=(start1+end1)/2;
        int i2=(n+m+1)/2-i1;
        int min1=(i1==n)?Integer.MAX_VALUE:nums1[i1];
        int max1=(i1==0)?Integer.MIN_VALUE:nums1[i1-1];
        int min2=(i2==m)?Integer.MAX_VALUE:nums2[i2];
        int max2=(i2==0)?Integer.MIN_VALUE:nums2[i2-1];
        if(max1<=min2 && max2<=min1){
            if((n+m)%2==0){
                return ((double)(Math.max(max1,max2)+Math.min(min1,min2))/2);
            }else{
                return ((double) Math.max(max1,max2));
            }
        }
        else if(max1>min2){end1=i1-1; }
        else{ start1=i1+1; }
    }
    return 0;

}
}