class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int num : nums){
            if(min>num) min=num;
        }
        int ans = 0;
        for(int num : nums) ans+=num-min;
        return ans;
    }
}