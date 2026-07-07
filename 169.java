class Solution {
    public int majorityElement(int[] nums) {
        // Map<Integer, Integer> map = new HashMap<>();
        // int majority = 0;
        // int ans = -1;
        // for(int num : nums){
        //     map.put(num, map.getOrDefault(num, 0)+1);
        // }
        // for(int num : nums){
        //     if(majority < map.get(num)){
        //         majority = map.get(num);
        //         ans = num;
        //     }
        // }
        // return ans;

        int majority = -1, count = 0;

        for(int i=0; i<nums.length; i++){
            if(count == 0){
                majority = nums[i];
            }
            if(nums[i] == majority){
                count++;
            }else{
                count--;
            }
        }
        return majority;
    }
}