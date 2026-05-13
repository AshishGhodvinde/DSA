import java.util.*;
class Solution {
    public void duplicateZeros(int[] arr) {
        List<Integer> l = new ArrayList<>();
        int n = arr.length;
        int s = 0;
        for(int num : arr){
            if(num!=0){
                l.add(num);
                s++;
            }else if(num==0){
                l.add(0);
                l.add(0);
                s++;
            }
            if(s==n)    break;
        }
        for(int i=0; i<n; i++){
            arr[i] = l.get(i);
        }
    }
}