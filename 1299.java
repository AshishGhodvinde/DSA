class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        for(int i=arr.length-1; i>=0; i--){
            int cur = arr[i];
            arr[i] = max;   //because we dont have to include the current element, we have to find greater element which is strictly to it's right
            max = Math.max(max, cur);
        }
        return arr;
    }
}