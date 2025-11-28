class Solution {
    public String convert(String s, int numRows) {

        if(numRows == 1 || s.length()<=numRows) return s;
        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i=0; i<numRows; i++){
            rows[i] = new StringBuilder();
        }

        int n=0;    //current row
        boolean down = false;
        for(char ch : s.toCharArray()){
            rows[n].append(ch);

            //changing directions at top and bottom
            if(n==0 || n==numRows-1){
                down = !down;
            }

            n += (down)? 1:-1;
        }

        StringBuilder ans = new StringBuilder();
        for(StringBuilder sb : rows){
            ans.append(sb);
        }

        return ans.toString();
    }
}