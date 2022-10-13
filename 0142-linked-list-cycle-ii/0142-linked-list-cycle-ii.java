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
        ListNode resultNode = null;
        ListNode curr = head;

        Set<ListNode> set = new HashSet<>();

        while (curr != null) {
            if (set.isEmpty() || !set.contains(curr)) {
                set.add(curr);
            } else {
                resultNode = curr;
                break;
            }
            curr = curr.next;
        }

        return resultNode;
    }
}
