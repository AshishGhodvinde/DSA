class Solution {
    public int countBeautifulPairs(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        for(int i=0; i<n; i++){
            String str = String.valueOf(nums[i]);
            for(int j=i+1; j<n; j++){
                int x = str.charAt(0)-'0';
                if(gcd(x, nums[j]%10)==1)    cnt++;
            }
        }
        return cnt;
    }
    public int gcd(int a, int b){
        if(b==0)    return a;
        return gcd(b, a%b);
    }
}