class Solution {
    public boolean halvesAreAlike(String s) {
        // Set<Character> set = new HashSet<>();
        // set.add('a'); set.add('e'); set.add('i'); set.add('o'); set.add('u');
        // set.add('A'); set.add('E'); set.add('I'); set.add('O'); set.add('U');

        int mid = s.length()/2;
        int cnt = 0;
        for(int i=0; i<mid; i++){
            char chA = s.charAt(i);
            if(chA=='a' || chA=='e' || chA=='i' || chA=='o' || chA=='u' || chA=='A' || chA=='E' || chA=='I' || chA=='O' || chA=='U')    cnt++;
            char chB = s.charAt(mid+i);
            if(chB=='a' || chB=='e' || chB=='i' || chB=='o' || chB=='u' || chB=='A' || chB=='E' || chB=='I' || chB=='O' || chB=='U')    cnt--;

            // if(set.contains(chA))   cnt++;
            // if(set.contains(chB))   cnt--;
        }

        return cnt==0;
    }
}
