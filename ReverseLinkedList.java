/**
 * Reverse a singly linked list.

 click to show more hints.

 Hint:
 A linked list can be reversed either iteratively or recursively. Could you implement both?

 * Created by yuchaozh on 16/6/1.
 */

// iterative solution
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}

// recursive solution
public class Solution {
    public ListNode reverseList(ListNode head) {
        
    }
}