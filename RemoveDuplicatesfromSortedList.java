/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.

 For example,
 Given 1->1->2, return 1->2.
 Given 1->1->2->3->3, return 1->2->3.

 * Created by yuchaozh on 15/1/29.
 */
public class RemoveDuplicatesfromSortedList
{
	public ListNode deleteDuplicates(ListNode head)
	{
		// no node
		if (head == null)
			return null;
		// only one node
		if (head.next == null)
			return head;
		ListNode tmp = head;
		// if delete one same node, then run again at previous same node
		// until there is no same node, then move to next node
		while (tmp.next != null)
		{
			if (tmp.val == tmp.next.val)
				tmp.next = tmp.next.next;
			else
				tmp = tmp.next;
		}
		return head;
	}
}
