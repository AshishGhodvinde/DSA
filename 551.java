class Solution {
    public boolean checkRecord(String s) {
        int absentCnt = 0, lateCnt = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!='L')    lateCnt=0;
            if(s.charAt(i)=='L')    lateCnt++;
            if(s.charAt(i)=='A')    absentCnt++;

            if(absentCnt==2 || lateCnt==3)  return false;
        }
        return true;
    }
}
