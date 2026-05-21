class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int sum1 = 0, sum2 = 0, n = nums1.length;
        for(int i=0; i<n; i++){
            sum1+=nums1[i];
            sum2+=nums2[i];
        }
        return (sum2-sum1)/n;
        // Arrays.sort(nums1);
        // Arrays.sort(nums2);
        // return nums2[0]-nums1[0];
    }
}