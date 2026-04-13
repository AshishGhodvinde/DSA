class Solution {
    public int arraySign(int[] nums) {
        int negCnt = 0;
        for(int num : nums){
            if(num < 0){
                negCnt+=1;
            }
            if(num == 0){
                return 0;
            }
        }
        return (negCnt%2==0)? 1:-1;
    }
}