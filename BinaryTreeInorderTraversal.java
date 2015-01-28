/**
 * Given a binary tree, return the inorder traversal of its nodes' values.

 For example:
 Given binary tree {1,#,2,3},
 1
 \
 2
 /
 3
 return [1,3,2].

 Note: Recursive solution is trivial, could you do it iteratively?

 * Created by yuchaozh on 15/1/27.
 */
public class BinaryTreeInorderTraversal
{
	public List<Integer> inorderTraversal(TreeNode root)
	{
		List<Integer> lists = new ArrayList<Integer>();
		if (root == null)
			return lists;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		// use track to track node
		TreeNode track = root;
		// track left, tmp right
		while (!stack.empty() || track != null)
		{
			if (track != null)
			{
				stack.push(track);
				track = track.left;
			}
			// pop twice times (left leaf node and its parent) when encounter leaf node
			// firstly, pop leaf node, its right node is null, so pop its parent node
			// and push the right child of that parent node into stack
			else
			{
				TreeNode tmp = stack.pop();
				lists.add(tmp.val);
				track = tmp.right;
			}
		}
		return lists;
	}
}
