class Solution {
    public int totalWaviness(int num1, int num2) {
        int sum = 0;
        int start = Math.max(100, num1);
        for(int i=start; i<=num2; i++){
            sum+=wavy(i);
        }
        return sum;
    }
    public int wavy(int n){
        String str = String.valueOf(n);
        int len = str.length();
        int cnt = 0;
        for(int i=1; i<len-1; i++){
            //prev = str.charAt(i-1), next = str.charAt(i+1), current = str.charAt(i)
            if(str.charAt(i)<str.charAt(i-1) && str.charAt(i)<str.charAt(i+1) || str.charAt(i)>str.charAt(i-1) && str.charAt(i)>str.charAt(i+1)){
                cnt++;
            }
        }
        return cnt;
    }
}