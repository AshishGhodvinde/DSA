class Solution {
    public int dominantIndex(int[] nums) {
        int maxIdx = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > nums[maxIdx]){
                maxIdx = i;
            }
        }
        for(int i=0; i<nums.length; i++){
            if(i!=maxIdx){
                if(nums[i]*2 > nums[maxIdx])    return -1;
            }
        }
        return maxIdx;
    }
}