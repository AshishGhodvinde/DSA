class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if(n==0 || n==1){
            return;
        }

        int i=0;
        for(int j=0; j<n; j++){
            if(nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
            }
        }
    }
}
