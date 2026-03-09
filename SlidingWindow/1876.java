package SlidingWindow;

class Solution {
    public int countGoodSubstrings(String s) {
        int cnt = 0, start = 0;
        int[] freq = new int[26];
        for (int end = 0; end < s.length(); end++) {
            freq[s.charAt(end) - 'a']++;
            int range = end - start + 1;
            //if window size is 3, check for good array and shrink the window size :)
            if (range == 3) {
                if (isGoodArray(freq))
                    cnt++;
                //moving window forward
                freq[s.charAt(start++) - 'a']--;
            }  
        }
        return cnt;
    }

    public boolean isGoodArray(int[] arr) {
        for (int i = 0; i < 26; i++) {
            if (arr[i] > 1)
                return false;
        }
        return true;
    }
}