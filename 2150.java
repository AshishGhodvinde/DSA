import java.util.*;
class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> l = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        for(int val : nums){
            if(map.containsKey(val) && !map.containsKey(val+1) && !map.containsKey(val-1) && map.get(val)==1)   l.add(val);
        }
        return l;
    }
}

