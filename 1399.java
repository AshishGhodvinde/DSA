import java.util.*;
class Solution {
    public int countLargestGroup(int n) {
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int i=1; i<=n; i++){
        //     map.put(digSum(i), map.getOrDefault(digSum(i), 1)+1);
        // }
        int[] digSumArr = new int[37];
        for(int i=1; i<=n; i++){
            digSumArr[digSum(i)]+=1;
        }
        // Arrays.sort(digSumArr);
        // int max = digSumArr[digSumArr.length-1];
        int cnt = 0, max=0;
        // for(int i=digSumArr.length-1; i>=0; i--){
        //     if(digSumArr[i]==max)   cnt++;
        // }

        for(int i=0; i<37; i++){
            if(digSumArr[i]>max){
                max = digSumArr[i];
                cnt=1;
            }else if(digSumArr[i]==max){
                cnt++;
            }
        }

        return cnt;
    }
    public int digSum(int n){
        int sum = 0;
        while(n>0){
            int r = n%10;
            sum+=r;
            n/=10;
        }
        return sum;
    }
}
