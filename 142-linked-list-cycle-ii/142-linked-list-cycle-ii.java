/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        boolean isCyclic = false;
        ListNode resultantNode = null;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                isCyclic = true;
                break;
            }
        }
        
        if(isCyclic){
            slow = head;
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
            resultantNode = slow;
        }
        
        return resultantNode;
    }
}