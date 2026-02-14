class Solution {
    public boolean areNumbersAscending(String s) {
        String[] chars = s.split(" ");
        int prev = -1;
        for(String ch : chars){
            if(ch.matches("\\d+")){
                int num = Integer.parseInt(ch);
                if(num<=prev)   return false;
                prev = num;
            }
        }
        return true;
    }
}