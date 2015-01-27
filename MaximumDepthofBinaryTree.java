/**
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * Created by yuchaozh on 15/1/26.
 */
public class MaximumDepthofBinaryTree
{
	public int maxDepth(TreeNode root)
	{
		if (root == null)
			return 0;
		else
		{
			int leftDepth = maxDepth(root.left);
			int rightDepth = maxDepth(root.right);
			return Math.max(leftDepth, rightDepth) + 1;
		}
	}
}
