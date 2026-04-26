class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        // int pre[] = new int[n];
        // pre[0] = 0;
        // for(int i=1; i<n; i++){
        //     pre[i] = pre[i-1]+nums[i];
        // }
        // int suf[] = new int[n];
        // suf[n-1] = 0;
        // for(int i=n-2; i>=0; i--){
        //     suf[i] = suf[i+1]+nums[i];
        // }

        // for(int i=1; i<n-1; i++){
        //     if(pre[i-1]==suf[i+1]){
        //         return i;
        //     }
        // }
        // return -1;

        int total = 0;
        for(int num : nums) total+=num;
        int leftSum = 0;
        for(int i=0; i<n; i++){
            int rightSum = total-leftSum-nums[i];
            if(leftSum == rightSum){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}