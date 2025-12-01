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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //used dummynode for edge cases, i.e. want to delete fiest node(head node)
        //(fast!=null && fast.next!=null) return null;  ==> equivalent     
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        //move fast pointer n+1 steps ahead slow
        for(int i=0; i<=n; i++){
            fast=fast.next;
        }

        //move both pointers util fast reaches null
        //slow is just behind the node which has to be deleated
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }

        //skiping nth node
        slow.next = slow.next.next;
        return dummy.next;
    }
}

//Alternate
// we first count the length of whole LL, subtract n from it
// run loop till length-n and delete the node