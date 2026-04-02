class Solution {
    public int differenceOfSum(int[] nums) {
        int wSum = 0, dSum = 0;
        for(int i = 0; i<nums.length; i++){
            wSum+=nums[i];
            dSum += digitSum(nums[i]);
        }
        return Math.abs(wSum - dSum);
    }
    public int digitSum(int num){
        int sum = 0;
        while(num > 0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}