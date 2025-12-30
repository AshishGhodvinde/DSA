class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for(int i=0; i<nums.length; i++){
            arr[i] = String.valueOf(nums[i]);
        }

        //this is a lambda expression, Array is sortend with custom rule. here we are comparing strings
        //Arrays.sort(array, comparator)
        //it compares string, eg. "3" and "30"
        //it compare both like 1. "3"+"30" & "30"+"3"
        // "330" > "303", 
        Arrays.sort(arr, (a, b)-> (b+a).compareTo(a+b));
        
        if(arr[0].equals("0"))  return "0";

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}