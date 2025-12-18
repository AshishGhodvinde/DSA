import java.util.*;
class Solution {
    public int maximumSum(int[] nums) {
        // Map<Integer, Integer> map = new HashMap<>();
        // storing (dSum, num) 
        
        // int res = -1;
        // for(int num : nums){
        //     int dSum = digitSum(num);
        //     if(map.containsKey(dSum)){
        //         res = Math.max(res, num+map.get(dSum));
                // (dSum, num) -> num => storing the greatest number containg dSum(like many numbers will have same dSum so store the maximum)  
                // map.put(dSum, Math.max(num, map.get(dSum)));    //comparing current num and previous num whose dSum is same
    //         }else{
    //             map.put(dSum, num);
    //         }
    //     }

    //     return res;
    // }
    // public int digitSum(int n){
    //     int sum = 0;
    //     while(n>0){
    //         int r = n%10;
    //         sum += r;
    //         n /= 10;
    //     }
    //     return sum;
    // }

    //index = dSum, map[index] = max num having dSum 
        int[] map = new int[82];
        Arrays.fill(map, -1);
        int res = -1;
        for(int num : nums){
            int dSum = 0, temp = num;
            while(temp>0){
                int r = temp%10;
                dSum += r;
                temp /= 10;
            }
            if(map[dSum] != -1){    //atleast one num having dSum
                res = Math.max(res, num+map[dSum]);
                map[dSum] = Math.max(num, map[dSum]);   //update map[dSum] with max of current num having dSum and previous num who had dSum equal
            }else{
                map[dSum] = num;
            }
        }

        return res;
    }
}
