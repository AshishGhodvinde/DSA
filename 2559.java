class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] pre = new int[n+1];

        // prefix array stores the no. of valid strings till index i
        for(int i=0; i<words.length; i++){
            String word = words[i];
            boolean valid = isVowel(word.charAt(0)) && isVowel(word.charAt(word.length()-1));
            pre[i+1] = pre[i] + (valid?1:0);
        }
        int[] ans = new int[queries.length];
        for(int i=0; i<queries.length; i++){
            int l = queries[i][0];
            int r = queries[i][1];

            // subtracting removes everything before l, if we would have only a index and not range, then the answer would simply be pre[r], due to lower bound we have to subtract the counts till lower bound
            ans[i] = pre[r+1] - pre[l];    
        }
        return ans;
    }
    public boolean isVowel(char ch){
        return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u');
    }
}