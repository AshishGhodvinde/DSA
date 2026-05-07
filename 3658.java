class Solution {
    public int gcdOfOddEvenSums(int n) {
        //odd sum = n*n
        int oddSum = n*n;
        //even sum = n(n+1)
        int evnSum = n*(n+1);
        return gcd(oddSum, evnSum);
        // return n;
    }
    public int gcd(int a, int b){
        if(b==0)    return a;
        return gcd(b, a%b);
    }
}