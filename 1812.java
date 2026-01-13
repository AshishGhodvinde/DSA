class Solution {
    public boolean squareIsWhite(String coordinates) {
        char ch = coordinates.charAt(0);
        int num = coordinates.charAt(1);

        if(ch=='a' || ch=='c' || ch=='e' || ch=='g'){
            return num%2==0;
        }else{
            return num%2==1;
        }
    }
}
