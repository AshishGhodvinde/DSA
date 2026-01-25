class Solution {
    public int trailingZeroes(int n) {
        // if(n<=4)    return 0;
        // int cnt = 0;
        // for(int i=5; n/i>0; i*=5)   cnt+=n/i;
        // return cnt;


        int cnt = 0;
        while(n>0){
            n /= 5;
            cnt += n;
        }
        return cnt;
    }
}