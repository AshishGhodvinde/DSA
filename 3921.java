class Solution {
    public int[] scoreValidator(String[] events) {
        int total = 0, ctr = 0;
        for(int i=0; i<events.length; i++){
            if(ctr==10) break;
            String str = events[i];
            if(str.equals("0")) total+=0;
            if(str.equals("1")) total+=1;
            if(str.equals("2")) total+=2;
            if(str.equals("3")) total+=3;
            if(str.equals("4")) total+=4;
            if(str.equals("6")) total+=6;
            if(str.equals("W")) ctr+=1;
            if(str.equals("WD") || str.equals("NB")) total+=1;
        }
        return new int[]{total, ctr};
    }
}