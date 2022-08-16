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

    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<Integer>();
        Queue<Integer> queue = new LinkedList<Integer>();
        ListNode temp = head;
        int size = 0;

        while (temp != null) {
            stack.add(temp.val);
            queue.add(temp.val);
            temp = temp.next;
        }

        while (!stack.isEmpty()) {
            int stackElement = stack.pop();
            int queueElement = queue.poll();
            if (stackElement != queueElement) return false;
        }

        return true;
    }
}
