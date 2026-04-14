import java.util.*;

class Solution {
    public int missingMultiple(int[] nums, int k) {
        ArrayList<Integer> l = new ArrayList<>();
        for(int num : nums)
            l.add(num);

        for(int i=1; i<102; i++){
            if(!l.contains(k*i))  return k*i;
        }
        return -1;
    }
}
