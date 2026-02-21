import java.util.*;
class Solution {
    public String resultingString(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(!stack.isEmpty() && isRemovable(stack.peek(), ch)){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : stack){
            sb.append(ch);
        }
        return sb.toString();
    }
    public boolean isRemovable(char a, char b){
        return (a=='z' && b=='a') || (a=='a' && b=='z' || Math.abs(a-b)==1) ;
    }
}