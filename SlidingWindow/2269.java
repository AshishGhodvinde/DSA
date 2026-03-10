package SlidingWindow;

class Solution {
    public int divisorSubstrings(int num, int k) {
        // int cnt = 0;
        // String s = String.valueOf(num); 

        // for(int i=0; i<=s.length()-k; i++){
        //     int div = Integer.parseInt(s.substring(i, i+k)); //no need to subtract 1 as substring decrements 1 length itself
        //     if(div!=0 && num%div==0)  cnt++;
        // }
        // return cnt;

        int count = 0;
        int org = num;
        //this to take modulo with org to get the required k length substring
        int tenK = (int) Math.pow(10, k); 
        //To find number of digits in a number
        int digits = (int) Math.log10(num) + 1;
        //until the div becomes first k digits, to avoid less than k digits div 
        int times = digits - k + 1;
        while (times > 0) {
            int div = num % tenK;
            if (div != 0 && org % div == 0)
                count++;
            num /= 10;
            times--;
        }
        return count; 
    }
}