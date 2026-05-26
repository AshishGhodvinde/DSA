import java.util.*;

class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long> stack = new Stack<>();

        for(int num : nums){
            long cur = num;
            while(!stack.isEmpty() && stack.peek()==cur){
                stack.pop();
                cur+=cur;
                //don't push cur immediately, if nums=[2,2,4,5] -> cur=4, nums=[4,5] -> cur=8, nums=[5] -> then we get diff num so push cur to stack now  
            }    
                //push final merged value
                stack.push(cur);
            
        }
        List<Long> l = new ArrayList<>();
        for(long num : stack){
            l.add(num);
        }
        return l;
    }
}