class Solution {
    public int countCollisions(String directions) {
        int n = directions.length();
        if(n == 1)  return 0;
        int l=0, r=n-1;

        //cars at leftmost moving Left will never cause any collision and vice versa. so removing that free cars
        while(l<n && directions.charAt(l)=='L') l++;
        while(r>=0 && directions.charAt(r)=='R') r--;
        if(l>=r)    return 0;

        //remaing cars in middle will collide atleast once except they are S
        int cnt = 0;
        for(int i=l; i<=r; i++){
            if(directions.charAt(i)!='S')   cnt++;
        }
        return cnt;
    }
}