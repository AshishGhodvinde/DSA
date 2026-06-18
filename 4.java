class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m=nums2.length;
        int[] arr = new int[n+m];
        int i=0, j=0, k=0;

        while(i<n && j<m){
            if(nums1[i]<=nums2[j]){
                arr[k]=nums1[i];
                i++;
                k++;
            }else if(nums1[i]>nums2[j]){
                arr[k] = nums2[j];
                j++;
                k++;
            }
        }
        while(i<n){
            arr[k]=nums1[i];
            i++;
            k++;
        }
        while(j<m){
            arr[k]=nums2[j];
            j++;
            k++;
        }

        if(arr.length%2==1){
            return (double)arr[(m+n)/2];
        }else{
            return ((double)arr[(n+m)/2 - 1]+(double)arr[(n+m)/2])/2.0;
        }
    }
}