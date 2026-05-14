class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int ctr = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 != 0){
                ctr++;
                if(ctr == 3)    return true;
            }else{
                ctr = 0;
            }
        }
        return false;
    }
}