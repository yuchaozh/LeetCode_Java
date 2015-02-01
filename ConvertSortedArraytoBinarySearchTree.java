/**
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 *
 * Created by yuchaozh on 15/1/30.
 */
public class ConvertSortedArraytoBinarySearchTree
{
	public TreeNode sortedArrayToBST(int[] num)
	{
		return buildTree(0, num.length - 1, num);
	}

	public TreeNode buildTree(int start, int end, int[]num)
	{
		// need to return null, because leaf node
		if (start > end)
			return null;

		// the root node
		int mid = start + (end - start) / 2;
		TreeNode node = new TreeNode(num[mid]);
		// recursive to build subtree
		node.left = buildTree(start, mid - 1, num);
		node.right = buildTree(mid + 1, end, num);
		return node;
	}
}
