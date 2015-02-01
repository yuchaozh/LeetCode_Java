/**
 * Given a linked list, swap every two adjacent nodes and return its head.

 For example,
 Given 1->2->3->4, you should return the list as 2->1->4->3.

 Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.

 * Created by yuchaozh on 15/1/30.
 */
public class SwapNodesinPairs
{
	public ListNode swapPairs(ListNode head)
	{
		// 0 or 1 node, just return
		if (head == null || head.next == null)
			return head;

		ListNode fakeHead = new ListNode(0);
		fakeHead.next = head;
		head = fakeHead;
		ListNode p = head;
		while (p.next != null && p.next.next != null)
		{
			// if (p.next == null)
			//     break;
			// if (p.next.next == null)
			//     break;
			// use p as a flag
			ListNode q1 = p.next;
			ListNode q2 = p.next.next;

			q1.next = q2.next;
			p.next = q2;
			q2.next = q1;
			// use p = q1, move two steps ahead
			p = q1;
		}
		return fakeHead.next;
	}
}
