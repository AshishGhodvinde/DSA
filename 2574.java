class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] preArr = new int[nums.length];
        int[] suffArr = new int[nums.length];

        preArr[0] = 0;
        suffArr[nums.length-1] = 0;

        for(int i=1; i<nums.length; i++){
            preArr[i] = preArr[i-1]+nums[i-1];
        }
        for(int i=nums.length-2; i>=0; i--){
            suffArr[i] = suffArr[i+1]+nums[i+1];
        }
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i] = Math.abs(preArr[i]-suffArr[i]);
        }
        return ans;
    }
}