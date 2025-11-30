class Solution {
    public String longestCommonPrefix(String[] strs) {
        //comapre first string with all 
        String prefix = strs[0];
        for(int i=0; i<strs.length; i++){

            //checking each word with first and shriking it
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length()-1);
            }
            if(prefix.isEmpty()){
                return "";
            }
        }

        return prefix;
    }
}
