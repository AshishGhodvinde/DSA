import java.util.*;
class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int[]>stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek()[0]==ch){
                stack.peek()[1]++;
                if(stack.peek()[1]==k){
                    stack.pop();
                }
            }else{
                stack.push(new int[]{ch, 1});
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int[] arr : stack){
            char ch = (char)arr[0];
            int cnt = arr[1];
            for(int i=0; i<cnt; i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
