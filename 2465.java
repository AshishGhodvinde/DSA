import java.util.*;
class Solution {
    public int distinctAverages(int[] nums) {
        // idea : no need to remove any element, we can just shift the pointers
        // also no need for calculating averages as if the sum of two numbers is different thier average will also be different
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            int sum = nums[i]+nums[n-1-i];
            set.add(sum);
        }
        return set.size();
    }
}