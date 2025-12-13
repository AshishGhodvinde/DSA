import java.util.*;
class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
            set.add(reverseDigits(n));
        }

        return set.size();
    }
    public int reverseDigits(int n){
        int rev = 0;
        while(n > 0){
            int r = n%10;
            rev = rev*10 + r;
            n /= 10;
        }
        return rev;
    }
}
