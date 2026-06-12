class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1)    return nums[0];

        int sum = 0, best = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(sum<0)   sum=0;      //remove the load, as negative number will only make the resulting sum lesser
            sum+=nums[i];
            best = Math.max(best, sum);
        }
        return best;
    }
}