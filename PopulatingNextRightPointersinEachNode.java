/**
 Given a binary tree

 struct TreeLinkNode {
 TreeLinkNode *left;
 TreeLinkNode *right;
 TreeLinkNode *next;
 }
 Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

 Initially, all next pointers are set to NULL.

 Note:

 You may only use constant extra space.
 You may assume that it is a perfect binary tree (ie, all leaves are at the same level, and every parent has two children).
 For example,
 Given the following perfect binary tree,
 1
 /  \
 2    3
 / \  / \
 4  5  6  7
 After calling your function, the tree should look like:
 1 -> NULL
 /  \
 2 -> 3 -> NULL
 / \  / \
 4->5->6->7 -> NULL

 * Created by yuchaozh on 15/1/27.
 */
public class PopulatingNextRightPointersinEachNode
{
	// solution 1
	public void connect(TreeLinkNode root)
	{
		Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
		if (root == null)
			return;
		queue.add(root);
		int i = 1, l = 1;
		while (!queue.isEmpty())
		{
			TreeLinkNode tmp = queue.remove();
			if (tmp.left != null && tmp.right != null)
			{
				queue.add(tmp.left);
				queue.add(tmp.right);
			}
			if (i == (Math.pow(2, l) - 1))
			{
				tmp.next = null;
				i++;
				l++;
			}
			else
			{
				tmp.next = queue.peek();
				i++;
			}
		}
	}

	// solution 2
	public void connect(TreeLinkNode root)
	{
		if (root == null)
			return;
		TreeLinkNode parent = root;
		// the first node of next level
		TreeLinkNode next = parent.left;
		while (parent != null && next != null)
		{
			// cursor of per level
			TreeLinkNode prev = null;
			while (parent != null)
			{
				// first step
				if (prev == null)
				{
					prev = parent.left;
				}
				else  //rest steps, parent changed and keep doing same steps
				{
					prev.next = parent.left;
					prev = prev.next;
				}
				prev.next = parent.right;
				prev = prev.next;
				parent = parent.next;
			}
			parent = next;
			next = parent.left;
		}
	}
}
