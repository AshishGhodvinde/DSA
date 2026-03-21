import java.util.*;
class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        List<Integer> l = new ArrayList<>(set);
        Collections.sort(l, Collections.reverseOrder());
        int[] res = new int[Math.min(k, l.size())];

        for(int i=0; i<res.length; i++){
            res[i]=l.get(i);
        }
        return res;
    }
}