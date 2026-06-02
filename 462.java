import java.util.*;
class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = nums[nums.length/2], sum = 0;
        for(int num : nums) sum+=Math.abs(num-mid);
        return sum;
    }
}