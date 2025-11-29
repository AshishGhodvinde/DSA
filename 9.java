class Solution {
    public boolean isPalindrome(int x) {
        //converting int to string
        // String s = String.valueOf(x);
        // int n = s.length();

        // for(int i=0; i<n; i++){
        //     if(s.charAt(i) != s.charAt(n-1-i)){
        //         return false;
        //     }
        // }
        // return true;

        int tmp = x;
        int inv = 0;
        while(tmp > 0){
            int r = tmp%10;
            inv = (inv*10) + r;
            tmp/=10;
        }
        if(inv == x)
            return true;
        return false;
    }
}
