class Solution {
    public int numberOfSpecialChars(String word) {
        // Set<Character> set = new HashSet<>();
        // for(char ch : word.toCharArray()){
        //     set.add(ch);
        // }
        // int cnt = 0;
        // for(char i='a'; i<='z'; i++){
        //     if(set.contains(i) && set.contains((char)(i-'a'+'A'))){
        //         cnt++;
        //     }
        // }
        // return cnt;

        boolean[] lower = new boolean[26];
        boolean[] upper = new boolean[26];

        for(char ch : word.toCharArray()){
            if(Character.isUpperCase(ch)){
                upper[ch-'A'] = true;
            }else if(Character.isLowerCase(ch)){
                lower[ch-'a'] = true;
            }
        }
        int cnt = 0;
        for(int i=0; i<26; i++){
            if(lower[i] && upper[i])    cnt++;
        }
        return cnt;
    }
}