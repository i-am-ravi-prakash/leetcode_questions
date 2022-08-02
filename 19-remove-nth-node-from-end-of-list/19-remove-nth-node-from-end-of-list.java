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
    
    public ListNode removeNthNodeFromBeginning(ListNode head, int N){
        if(N == 1){
            return head.next;
        }
        else{
            ListNode prev = null;
            ListNode curr = head;
            int count = 1;
            
            while(count < N){
                prev = curr;
                curr = curr.next;
                count++;
            }
            
            prev.next = curr.next;
            
            return head;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int listLen = 0;

        while (temp != null) {
            temp = temp.next;
            listLen++;
        }
        temp = head;
        int tempLen = (listLen - n + 1);
        
        head = removeNthNodeFromBeginning(head, tempLen);

        return head;
    }
}
