class Solution {
    public boolean checkDivisibility(int n) {
        return n%sum(n)==0;
    }
    public int sum(int num){
        int digSum = 0;
        int digProd = 1;

        while(num>0){
            digSum += num%10;
            digProd *= num%10;

            num/=10;
        }
        return digSum+digProd;
    }
}