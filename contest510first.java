class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        // int startSec = (3600*Integer.parseInt(startTime.substring(0, 2))) + (60*Integer.parseInt(startTime.substring(3, 5))) + Integer.parseInt(startTime.substring(6, 8));
        // int endSec = (3600*Integer.parseInt(endTime.substring(0, 2))) + (60*Integer.parseInt(endTime.substring(3, 5))) + Integer.parseInt(endTime.substring(6, 8));

        String[] startSec = startTime.split(":"); 
        String[] endSec = endTime.split(":");

        int startSecInt = Integer.parseInt(startSec[0])*3600 + Integer.parseInt(startSec[1])*60 + Integer.parseInt(startSec[2]);
        int endSecInt = Integer.parseInt(endSec[0])*3600 + Integer.parseInt(endSec[1])*60 + Integer.parseInt(endSec[2]);
            
            
        return endSecInt-startSecInt;
    }
}