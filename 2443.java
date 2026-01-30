class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        if(num==0)  return true;
        for(int i=1; i<=num; i++){
            if(i+revSum(i)==num)  return true;
        }
        return false;
    }
    public int revSum(int n){
        int rev = 0;
        while(n>0){
            rev = rev*10 + (n%10);
            n /= 10;
        }
        return rev;
    }
}