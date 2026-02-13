class Solution {
    public int percentageLetter(String s, char letter) {
        // Map<Character, Integer> map = new HashMap<>();
        // for(int i=0; i<s.length(); i++){
        //     char ch = s.charAt(i);
        //     map.put(ch, map.getOrDefault(ch, 0)+1);
        // }
        // if(!map.containsKey(letter))    return 0;
        // return (int)(map.get(letter)*100)/s.length();
        
        int cnt = 0;
        for(char ch : s.toCharArray()){
            if(ch==letter)  cnt++;
        }
        return (int)(cnt*100)/s.length();
    }
}
