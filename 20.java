import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');


        for(char c : s.toCharArray()){
            if(map.containsValue(c)){
                stack.push(c);
            }else if(map.containsKey(c)){
                if(stack.isEmpty() || map.get(c) != stack.pop()){        //once the closing pranthersis is found, check for stack to be empty or the parenthesis which is being popped is the value of the closing parenthesis in map i.e. is the next character opening paranthesis
                    return false;
                }
            }
        }

        return stack.isEmpty();         // is stack is empty then all parenthesis are matched
    }
}
