class Solution {
    public int firstMissingPositive(int[] nums) {
        // Set<Integer> set = new HashSet<>();
        // for(int num : nums){
        //     set.add(num);
        // }
        // for(int i=1; i<nums.length+1; i++){
        //     if(!set.contains(i))    return i;
        // }

        // return nums.length+1;
        int n = nums.length;
        int i=0;

        while(i<n){
            int correctIndex = nums[i]-1;       //for every nums[i]
            if(nums[i]>0 && nums[i]<=n && nums[i] != nums[correctIndex]){        //if nums[i] is not at correct index, swap it with the one at that index
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }else{
                i++;
            }
        }

        for(int j=0; j<n; j++){
            if(nums[j] != j+1){
                return j+1;
            }
        }
        return n+1;
    }
}