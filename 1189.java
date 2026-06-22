class Solution {
    public int maxNumberOfBalloons(String text) {
        // Map<Character, Integer> freq = new HashMap<>();
        // for (char c : text.toCharArray()) {
        //     freq.put(c, freq.getOrDefault(c, 0) + 1);
        // }

        
        // String word = "balloon";
        // int ans = Integer.MAX_VALUE;

        // for (char c : word.toCharArray()) {
        //     int needed = 1;
        //     if (c == 'l' || c == 'o') needed = 2; 

        //     int available = freq.getOrDefault(c, 0);
        //     ans = Math.min(ans, available / needed);
        // }

        // return ans;
        int b=0, a=0, l=0, o=0, n=0;
        for(char ch : text.toCharArray()){
            if(ch == 'b')   b++;
            if(ch == 'a')   a++;
            if(ch == 'l')   l++;
            if(ch == 'o')   o++;
            if(ch == 'n')   n++;
        }
        return Math.min(b, Math.min(a, Math.min(n, Math.min(l/2, o/2))));
    }
}