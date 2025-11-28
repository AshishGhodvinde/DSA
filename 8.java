class Solution {
    public int myAtoi(String s) {
        // int n = s.length();
        //removing initial blank spaces
        s = s.trim();
        int sign = 1;
        long ans = 0;

        if(s.length() == 0) return 0;
        int i = 0;
        //checking sign
        if(s.charAt(0) == '-'){
            sign = -1;
            i++;
        }else if(s.charAt(0) == '+'){
            i++;
        }

        while(i<s.length()){
            char ch = s.charAt(i);
            if(ch < '0' || ch > '9')    break;
            ans = ans*10 + (ch-'0');

            //handling overflow
            if(sign*ans > Integer.MAX_VALUE)    return Integer.MAX_VALUE;
            if(sign*ans < Integer.MIN_VALUE)    return Integer.MIN_VALUE;
            i++;
        }

        return (int) (sign*ans);
    }
}

// 1. Trim blank spaces
// 2. Handle Sign
// 3. Compute number