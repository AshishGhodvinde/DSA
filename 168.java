class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while(columnNumber > 0){
            columnNumber--;         // as we are adding ascii value of A to it, we have to compensate it 
            // for colNum = 1, 0 -> 0+'A' = A
            sb.insert(0, (char)((columnNumber%26)+'A'));
            columnNumber /= 26;
        }

        return sb.toString();
    }
}


//pending