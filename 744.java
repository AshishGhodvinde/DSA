class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char ch : letters){
            if(ch-'0' > target-'0') return ch;
        }
        return letters[0];
    }
}