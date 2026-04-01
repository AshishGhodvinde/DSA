class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0], max = nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return gcdOfTwo(min, max);

    }
    public int gcdOfTwo(int a, int b){
        if(b==0)    return a;
        return gcdOfTwo(b, a%b);
    }
}