class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        int maxVowelCnt = 0, maxConsonentCnt = 0;

        for(char ch : s.toCharArray()){
            int idx = ch - 'a';
            freq[idx]++;

            if(ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u'){
                maxVowelCnt = Math.max(maxVowelCnt, freq[idx]);
            }else{
                maxConsonentCnt = Math.max(maxConsonentCnt, freq[idx]);
            }
        }
        return maxVowelCnt + maxConsonentCnt;
    }
}