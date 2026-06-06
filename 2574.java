class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        // int[] pre = new int[n];
        // int[] suf = new int[n];

        // pre[0] = 0;
        // for(int i=1; i<n; i++){
        //     pre[i] = pre[i-1]+nums[i-1];
        // }

        // suf[n-1] = 0;
        // for(int i=n-2; i>=0; i--){
        //     suf[i] = suf[i+1]+nums[i+1];
        // }

        // int[] ans = new int[n];
        // for(int i=0; i<n; i++){
        //     ans[i] = Math.abs(pre[i]-suf[i]);
        // }
        // return ans;

        int rightSum = 0, leftSum = 0;
        for(int num : nums) rightSum+=num;

        for(int i=0; i<n; i++){
            int val = nums[i];
            rightSum -= val;
            nums[i] = Math.abs(rightSum-leftSum);
            leftSum += val;
        }
        return nums;
    }
}