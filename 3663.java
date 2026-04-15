class Solution {
    public int getLeastFrequentDigit(int n) {
        // String str = String.valueOf(n);
        // Map<Character, Integer> map = new HashMap<>();
        // for(int i=0; i<str.length(); i++){
        //     char ch = str.charAt(i);
        //     map.put(ch, map.getOrDefault(ch, 0)+1);
        // }

        // int minFreq = Integer.MAX_VALUE;
        // int ans = 10;
        // for(char ch : map.keySet()){
        //     int freq = map.get(ch);
        //     int digit = ch-'0';

        //     if(freq<minFreq || (freq==minFreq && digit<ch-'0')){
        //         minFreq = freq;
        //         ans = digit;
        //     }
        // }
        // return ans;

        int[] freq = new int[10];
        int minFreq = Integer.MAX_VALUE; 
        int ans = -1;

        while(n>0){
            freq[n%10]++;
            n/=10;
        }

        for(int i=0; i<10; i++){
            if(freq[i]<minFreq && freq[i]>0){       //freq[i]>0, to find only the numbers which have some frequence
                minFreq = freq[i];
                ans = i;
            }
        }
        return ans;
    }
}