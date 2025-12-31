class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int ans[] = new int[n];
        int pos = -n;

        // after finding c, for the chars before finding pos we will calculate after
        for(int i=0; i<n; i++){
            if(s.charAt(i)==c)  pos=i;
            // i will always be greater than pos as we are calculating after we found pos
            ans[i]=i-pos;
        }

        // before characters distance also, updating the min distance possible
        for(int i=pos-1; i>=0; i--){
            if(s.charAt(i)==c)  pos=i;
            ans[i] = Math.min(ans[i], pos-i);
        }

        return ans;
    }
}