import java.util.*;
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int cnt = 0, n = nums.size();
        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //         if(nums.get(i) + nums.get(j) < target)    cnt++;
        //     }
        // }
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = nums.get(i);
        }
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] + arr[j] < target)    cnt++;
            }
        }
        return cnt;
    }
}