class Solution {
    public int largestInteger(int n, int s) {
        if(s==0) return 0;
        int max = -1;
        for(int i=(int)Math.pow(10, n-1); i<(int)Math.pow(10, n); i++){
            if(digSum(i)==s){
                max = Math.max(max, i);
            }
        }
        return max;
    }
    public int digSum(int num){
        int sum = 0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}