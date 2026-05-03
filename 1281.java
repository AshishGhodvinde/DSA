class Solution {
    public int subtractProductAndSum(int n) {
        return prod(n)-sum(n);
    }
    public int prod(int n){
        int p = 1;
        while(n>0){
            p*=n%10;
            n/=10;
        }
        return p;
    }
    public int sum(int n){
        int s = 0;
        while(n>0){
            s+=n%10;
            n/=10;
        }
        return s;
    }
}