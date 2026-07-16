import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        //comapre first string with all 
        // String prefix = strs[0];
        // for(int i=0; i<strs.length; i++){

        //     //checking each word with first and shriking it
        //     while(!strs[i].startsWith(prefix)){
        //         prefix = prefix.substring(0, prefix.length()-1);
        //     }
        //     if(prefix.isEmpty()){
        //         return "";
        //     }
        // }

        // return prefix;

        // String prefix = strs[0];
        // for(int i=0; i<strs.length; i++){
        //     while(!strs[i].startsWith(prefix)){
        //         prefix = prefix.substring(0, prefix.length()-1);
        //     }
        //     if(prefix.length()==0)  return "";
        // }
        // return prefix;

        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        StringBuilder sb = new StringBuilder();
        int min = Math.min(first.length(), last.length());
        for(int i=0; i<min; i++){
            if(first.charAt(i)!=last.charAt(i)){
                return sb.toString();
            }else{
                sb.append(first.charAt(i));
            }
        }
        return sb.toString();
    }
}