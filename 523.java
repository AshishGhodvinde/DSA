import java.util.*;
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);     //to ensure that, there are more than 1 element
        int sum = 0;

        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            int r = sum%k;
            if(!map.containsKey(r)){
                map.put(r, i);
            }else if(map.containsKey(r) && i-map.get(r)>1){
                return true;
            }
        }
        return false;
    }
}

// If at time 'A' the sum has remainder of X, then at time 'B' the sum again have remainder X then the numbers added between A and B will have the remainder 0 (Divisible by k).
