class Solution {
    public int maxPower(String s) {
        if(s.length()==0)   return 0;
        int max = 1, cur = 1;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)==s.charAt(i-1)){
                cur++;
            }else{
                max = Math.max(max, cur);
                cur = 1;
            }
        }
        // taking max, because if the last grp of chars is same. it won't update max
        return Math.max(max, cur);
    }
}