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
        if(head==null)
        return head;
       ListNode currNode = head.next;
        ListNode prevNode = head;
        prevNode.next=null;
        ListNode nextNode;
       while(currNode!=null){
        nextNode = currNode.next;
        currNode.next = prevNode;
        prevNode = currNode;
        currNode =   nextNode;
       }

    return prevNode;
    }
}