class Solution {
    public int maxFrequencyElements(int[] nums) {
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int num : nums){
        //     map.put(num, map.getOrDefault(num, 0)+1);
        // }
        // int max = -1;
        // for(int key : map.keySet()){
        //     max = Math.max(max, map.get(key));
        // }
        // int cnt = 0;
        // for(int key : map.keySet()){
        //     if(map.get(key)==max)   cnt+=max;
        // }
        // return cnt;
        int max = -1;
        int[] freqArr = new int[101];
        for(int num : nums){
            freqArr[num]++;
            max = Math.max(max, freqArr[num]);
        }
        int cnt = 0;
        for(int i=0; i<freqArr.length; i++){
            if(freqArr[i]==max) cnt+=max;
        }
        return cnt;
    }
}