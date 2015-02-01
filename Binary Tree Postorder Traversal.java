/**
 * Given a binary tree, return the postorder traversal of its nodes' values.

For example:
Given binary tree {1,#,2,3},
   1
    \
     2
    /
   3
return [3,2,1].

Note: Recursive solution is trivial, could you do it iteratively?
 */

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution 
{
    /** tricky to use current top and previous poped node */
    public List<Integer> postorderTraversal(TreeNode root) 
    {
        List<Integer> rst = new ArrayList<Integer>();
        if (root == null)
            return rst;
        Stack<TreeNode> st = new Stack<TreeNode>();
        st.push(root);
        // store current poped node
        TreeNode poped = root;
        while (!st.empty())
        {
            // store current top node
            TreeNode top = st.peek();
            // if current top node does not have left and right child or its right or left child has just poped
            // pop it too
            if ((top.left == null && top.right == null) || top.left == poped || top.right == poped)
            {
                poped = st.pop();
                rst.add(poped.val);
            }
            else
            {
                // push right first, then left
                if (top.right != null)
                    st.push(top.right);
                if (top.left != null)
                    st.push(top.left);
            }
        }
        return rst;
    }
}