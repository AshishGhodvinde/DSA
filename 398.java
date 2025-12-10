import java.util.*;
class Solution {
    //creating hashmap, store element with all their duplicates indices in a list
    //getting list of target element from map, getting a random value in that list, return that index's value (get)
    private Map<Integer, List<Integer>> idx = new HashMap<>();
    public Solution(int[] nums) {
        for(int i=0; i<nums.length; i++){
            if(!idx.containsKey(nums[i])){
                //inserting arraylist for new element, to add their duplicate's indices 
                idx.put(nums[i], new ArrayList<>());
            }
            idx.get(nums[i]).add(i);
        }
    }
    
    public int pick(int target) {
        Random random = new Random();
        if(idx.containsKey(target)){
            //getting the indices of target
            List<Integer> targetIndices = idx.get(target);
            //getting a random index, till arraylist length (all elements will be covered)
            //index of targetIndcies, not the answer
            int randomIndex = random.nextInt(targetIndices.size());
            //returning the index of the index of target element
            return targetIndices.get(randomIndex);
        }
        return -1;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */