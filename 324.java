import java.util.Arrays;
class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int l=(n-1)/2, r=n-1;

        int[] res = new int[n];
        for(int i=0; i<n; i++){
            if(i%2==0){
                res[i]=nums[l--];
            }else{
                res[i]=nums[r--];
            }
        }
        for(int i=0; i<n; i++){
            nums[i]=res[i];
        }
    }
}