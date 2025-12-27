class Solution {
    public int calPoints(String[] operations) {
        int[] arr = new int[operations.length];
        int i = 0;
        for(String op : operations){
            switch(op){
                case "C" : i--;
                break;

                case "D" : arr[i] = 2*arr[i-1]; i++;
                break;

                case "+" : arr[i] = arr[i-1] + arr[i-2]; i++;
                break;

                default :
                arr[i++] = Integer.parseInt(op);
            }
        }

        int sum = 0;
        // i is at the last element in the arr
        for(int j=0; j<i; j++)  sum+=arr[j];
        return sum;
    }
}