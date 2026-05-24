import java.util.*;
class Solution {
    public int passwordStrength(String password) {
        Set<Character> lower = new HashSet<>();
        Set<Character> upper = new HashSet<>();
        Set<Character> dig = new HashSet<>();
        Set<Character> special = new HashSet<>();

        for(char ch : password.toCharArray()){
            if(Character.isLowerCase(ch))  lower.add(ch);
            if(Character.isUpperCase(ch))  upper.add(ch);
            if(Character.isDigit(ch))  dig.add(ch);
            if(!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch))   special.add(ch);
        }
        return lower.size()*1 + upper.size()*2 + dig.size()*3 + special.size()*5;
    }
}