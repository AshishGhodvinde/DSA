import java.util.*;
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> l = new ArrayList<>();
        String str = "123456789";
        
        for(int i=2; i<=9; i++){            // i represents the length, and starting from 2 because we can't have sequence in 1 digit numbers
            for(int j=0; j+i<=9; j++){
                int num = Integer.parseInt(str.substring(j, i+j));
                if(num>=low && num<=high)   l.add(num);
            }
        }
        return l;
    }
}