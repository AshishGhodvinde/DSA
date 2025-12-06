// possible combinations from the conditions
// M  - 1000
// CM - 900
// D  - 500
// CD - 400
// C  - 100
// XC - 90
// L  - 50
// XL - 40
// X  - 10
// IX - 9
// V  - 5
// IV - 4
// I  - 1

class Solution {
    public String intToRoman(int num) {
        int[] integer = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<integer.length; i++){
            //until the num is bigger than any number in intCode, we ssubtract the intCode and append it'c corresponding character to sb
            while(num >= integer[i]){
                sb.append(roman[i]);
                num -= integer[i];
            }
        }

        return sb.toString();
    }
}

