/**
 * Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
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
    /** source code for cc150 4.1 */
    // public boolean isBalanced(TreeNode root) 
    // {
    //     if (root == null)
    //         return true;
        
    //     int minHeight = getMinHeight(root);
    //     int maxHeight = getMaxHeight(root);
    //     if (Math.abs(minHeight - maxHeight) > 1)
    //         return false;
    //     return true;
    // }
    
    // public int getMaxHeight(TreeNode root)
    // {
    //     if (root == null)
    //         return 0;
    //     return Math.max(getMaxHeight(root.left), getMaxHeight(root.right)) + 1;
    // }
    
    // public int getMinHeight(TreeNode root)
    // {
    //     if (root == null)
    //         return 0;
    //     return Math.min(getMinHeight(root.left), getMinHeight(root.right)) + 1;
    // }
    
    /**
    Note here is slightly different from the Cracking the Code Interview 4.1, one can notice that the code from 4.1 will not pass all the test samples here. That is because the definition of balanced. In 4.1, balanced is defined by all the node differs in depth less than or equal to 1. But here balanced is defined the difference of max depth of left tree and right tree are less than or equal to 1.

The key idea is from the 4.1, where compute the max and min depth of the whole tree and see the difference. Here, we compute the max depth of two sub tree of a node, if the difference is > 1, output false.
    */
    public boolean isBalanced(TreeNode root)
    {
        if (root == null)
            return true;
            
        if (Math.abs(getMaxHeight(root.left) - getMaxHeight(root.right)) > 1)
            return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    
    public int getMaxHeight(TreeNode root)
    {
        if (root == null)
            return 0;
        return Math.max(getMaxHeight(root.left), getMaxHeight(root.right)) + 1;
    }
}