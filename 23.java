import java.util.*;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length==0) return null;

        //to return head of new LinkedList afterwards using dummy node
        ListNode head = new ListNode(0);
        ListNode temp = head;
        List<Integer> l = new ArrayList<>();

        //adding all values of lists to Arraylist
        for(ListNode list : lists){
            while(list != null){
                l.add(list.val);
                list = list.next;
            }
        }
        //Sorting ArrayList
        Collections.sort(l);

        //Creating a LinkedList using temp
        for(int val : l){
            temp.next = new ListNode(val);
            temp = temp.next;
        }

        return head.next;
    }
}
