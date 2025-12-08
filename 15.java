import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //sort array
        //fix i (nums[i])
        //find two number such that nums[j]+nums[k] = -nums[i]
        //using two pointers left=i+1, right=n-1

        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        if(n<3) return ans;

        Arrays.sort(nums);
        
        for(int i=0; i<n-2; i++){
            if(i>0 && nums[i]==nums[i-1])   continue;
            if(nums[i] > 0) break;

            int left=i+1, right=n-1;
            int target = -nums[i];

            while(left<right){
                int sum = nums[left]+nums[right];
                if(sum == target){
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    
                    //avoiding duplicates
                    //as left moves ahead and right comes backward so they check if already used is not again counted i.e. avoid redundancy
                    while(left<right && nums[left]==nums[left-1])   left++;
                    while(left<right && nums[right]==nums[right+1]) right--;
                }else if(sum < target){
                    left++;
                }else{
                    right--;
                }
            }
        }

        return ans;
    }
}
