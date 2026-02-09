class Solution {
    public String generateTheString(int n) {
        char[] res = new char[n];
        Arrays.fill(res, 'a');

        if(n%2==0)  res[0]='b';
        
        return new String(res);
    }
}