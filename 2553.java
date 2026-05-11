import java.util.*;

class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> l = new ArrayList<>();

        for(int num : nums){
            String str = String.valueOf(num);
            for(char ch : str.toCharArray()){
                l.add(ch-'0');
            }
        }
        int[] ans = new int[l.size()];
        for(int i=0; i<l.size(); i++){
            ans[i] = l.get(i);
        }
        return ans;
    }
}