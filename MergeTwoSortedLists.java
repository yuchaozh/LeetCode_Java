/**
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 *
 * Created by yuchaozh on 15/1/30.
 */
public class MergeTwoSortedLists
{
	public ListNode mergeTwoLists(ListNode l1, ListNode l2)
	{
		// create a fake head, return its next in the end
		ListNode rst = new ListNode(0);
		// cursor for building new list
		ListNode cursor = rst;
		// if one of two lists is null quit the loop
		while (l1 != null && l2 != null)
		{
			// append the smaller one to the new list
			// just use the head (l1 and l2) to traverse the lists and destroy it.
			if (l1.val > l2.val)
			{
				cursor.next = l2;
				l2 = l2.next;
			}
			else
			{
				cursor.next = l1;
				l1 = l1.next;
			}
			cursor = cursor.next;
		}
		// handle the rest non-empty list
		if (l1 != null)
			cursor.next = l1;
		else
			cursor.next = l2;
		return rst.next;
	}
}
