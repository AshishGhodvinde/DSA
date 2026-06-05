class Solution {
    public String firstPalindrome(String[] words) {
        for(String str : words){
            if(isPalin(str))    return str;
        }
        return "";
    }
    public boolean isPalin(String s){
        int l=0, r=s.length()-1;

        while(l<=r){
            if(s.charAt(l)!=s.charAt(r))    return false;
            l++;
            r--;
        }
        return true;
    }
}