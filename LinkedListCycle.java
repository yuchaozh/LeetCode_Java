/**
 * Given a linked list, determine if it has a cycle in it.
 * Follow up:
 * Can you solve it without using extra space?
 *
 * Created by yuchaozh on 15/1/27.
 */
public class LinkedListCycle
{
	public boolean hasCycle(ListNode head)
	{
		if (head == null || head.next == null)
			return  false;
		ListNode faster = head;
		ListNode slower = head;
		// be careful for the while condition
		while (faster.next != null && faster.next.next != null)
		{
			faster = faster.next.next;
			slower = slower.next;
			if (faster == slower)
				return true;
		}
		return false;
	}
}
