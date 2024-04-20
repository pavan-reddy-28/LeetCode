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
    public ListNode reverseList(ListNode head) {
        
          if (head!=null && head.next != null) {
            head = reverse(head);

        }
        return head;
    
    
    }
     private ListNode reverse(ListNode root) {
        if (root.next.next == null) {
            root.next.next = root;
            ListNode result = root.next;
            root.next = null;
            return result;
        } else {
            ListNode result = reverseList(root.next);
            root.next.next = root;
            root.next = null;
            return result;
        }

    }
    
    
}