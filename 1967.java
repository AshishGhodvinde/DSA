class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int cnt = 0;
        // for(String str : patterns){
        //     if(word.contains(str))  cnt++;
        // }
        for(int i=0; i<patterns.length; i++){
            if(word.contains(patterns[i])){
                cnt++;
            }
        }
        return cnt;
    }
}