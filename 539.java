import java.util.*;
class Solution {
    public int findMinDifference(List<String> timePoints) {
        if(timePoints.size()>1440)  return 0;
        boolean[] arr = new boolean[1440];

        for(String str : timePoints){
            int min = 60*Integer.parseInt(str.substring(0, 2)) + Integer.parseInt(str.substring(3, 5));
            if(arr[min])    return 0;
            arr[min] = true;
        }
        
        // first for edge case
        int first = -1, prev = -1, ans = Integer.MAX_VALUE;

        for(int i=0; i<1440; i++){
            if(!arr[i]) continue;
            if(first == -1) first = i;
            if(prev != -1)  ans = Math.min(ans, i-prev);        // taking difference from previous element where value was true
            prev = i;
        }
        return Math.min(ans, 1440-prev+first);

        // List<Integer> l = new ArrayList<>();
        // for(String str : timePoints){
        //     l.add(60*Integer.parseInt(str.substring(0, 2)) + Integer.parseInt(str.substring(3, 5)));
        // }
        // Collections.sort(l);
        // int ans = Integer.MAX_VALUE;
        // for(int i=1; i<l.size(); i++){
        //     ans = Math.min(ans, l.get(i)-l.get(i-1));
        // }
        // int first = l.get(0), last = l.get(l.size()-1);

        // return Math.min(ans, 1440-last+first);
    }
}