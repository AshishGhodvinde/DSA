class Solution {
    public long sumAndMultiply(int n) {
        // String str = String.valueOf(n);
        // StringBuilder sb = new StringBuilder();

        // for(int i=0; i<str.length(); i++){
        //     if(str.charAt(i)=='0'){
        //         continue;
        //     }else{
        //         sb.append(str.charAt(i));
        //     }
        // }
        // if(sb.length()==0)  return 0;
        // long x = Long.parseLong(sb.toString());
        // long sum = 0, temp = x;
        
        // while(temp>0){
        //     sum+=temp%10;
        //     temp/=10;
        // }
        // return sum*x;

        // long x = 0;
        // int place = 1;
        // while(n>0){
        //     if(n%10 != 0){      // traversing from back and multiplying non-zero digit with it's place
        //         x+=(n%10)*place;
        //         place*=10;
        //     }
        //     n/=10;
        // }
        // long sum = 0, temp = x;
        // while(temp>0){
        //     sum+=temp%10;
        //     temp/=10;
        // }
        // return sum*x;


        long sum = 0, x = 0, place = 1;
        while(n>0){
            int r = n%10;
            n/=10;
            if(r==0)    continue;
            sum+=r;
            x+=(place*r);
            place*=10;
        }
        return sum*x;
    } 
}