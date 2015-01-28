/**
 *
 Given a binary tree, return the preorder traversal of its nodes' values.

 For example:
 Given binary tree {1,#,2,3},
 1
 \
 2
 /
 3
 return [1,2,3].

 Note: Recursive solution is trivial, could you do it iteratively?

 Classical problem,  the recursion version of the solution can be found here (you need do slight modification, can you do that?) . In this post, I solved it iteratively.  Which data structure do remind us ?  Yes! Stack!

 The algorithm has following steps:
 (1) Push the root node into the stack.
 (2) while the stack is not empty, do:
    a. pop the top node and print it.
    b. push the right child of the top node (if exists)
    c. push the left child of the top node (if exists)

 * Created by yuchaozh on 15/1/27.
 */

public class BinaryTreePreorderTraversal
{
	/** recursive  */
//     List<Integer> rst = new ArrayList<Integer>();
//     public List<Integer> preorderTraversal(TreeNode root)
//     {
//         addToList(root);
//         return rst;
//     }

//     public void addToList(TreeNode root)
//     {
//         if (root == null)
//             return;
//         rst.add(root.val);
//         preorderTraversal(root.left);
//         preorderTraversal(root.right);
//     }

	/** non-recursive */
	public List<Integer> preorderTraversal(TreeNode root)
	{
		List<Integer> lists = new ArrayList<Integer>();
		Stack<TreeNode> rst = new Stack<TreeNode>();
		// if root is null, you cannot return null. you need to return empty lists
		if (root == null)
			return lists;
		rst.push(root);
		while (!rst.empty())
		{
			TreeNode tmp = rst.pop();
			lists.add(tmp.val);
			if (tmp.right != null)
				rst.push(tmp.right);
			if (tmp.left != null)
				rst.push(tmp.left);
		}
		return lists;
	}
}
