import java.util.*;
class Solution {
    public String reformatDate(String date) {
        Map<String, String> map = new HashMap<>();
        map.put("Jan", "01");
        map.put("Feb", "02");
        map.put("Mar", "03");
        map.put("Apr", "04");
        map.put("May", "05");
        map.put("Jun", "06");
        map.put("Jul", "07");
        map.put("Aug", "08");
        map.put("Sep", "09");
        map.put("Oct", "10");
        map.put("Nov", "11");
        map.put("Dec", "12");

        StringBuilder sb = new StringBuilder();
        String[] arr = date.split("\\s+");
        sb.append(arr[2]).append("-");
        sb.append(map.get(arr[1])).append("-");
        sb.append(arr[0].length()==3?("0"+arr[0].substring(0, 1)):arr[0].substring(0, 2));

        return sb.toString();
    }
}