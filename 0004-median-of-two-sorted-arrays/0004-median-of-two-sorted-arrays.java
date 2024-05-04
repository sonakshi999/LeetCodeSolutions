class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int len = n+m;
        int arr[] = new int[len];
        
        int i = 0, j = 0, k = 0;
        while(i<n && j<m) {
            if(nums1[i]<nums2[j]) {
                arr[k++]=nums1[i++];
            }else{
                arr[k++]=nums2[j++];
            }
        }
        while(i<n) {
            arr[k++]=nums1[i++];
        }
        while(j<m) {
            arr[k++]=nums2[j++];
        }
        for(int ii=0;ii<len;ii++) {
            System.out.print(arr[ii]+" ");
        }
        if(len%2==0){
            return (double)(arr[len/2]+arr[len/2 -1])/2;
        }
        return arr[len/2];
    }
}