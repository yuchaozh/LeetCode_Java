/**
 * Given two binary trees, write a function to check if they are equal or not.
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 *
 * Created by yuchaozh on 15/1/26.
 */
public class SameTree
{
	public boolean isSameTree(TreeNode p, TreeNode q)
	{
		if (p == null && q == null)
			return true;
			// check the structure of both tree
		else if ((p == null && q != null) || (p != null && q == null))
			return false;
			// check node content
		else if (p.val != q.val)
			return false;
		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}
}
