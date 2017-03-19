package tech.loyd.leetcode;

/**
 * 
 * @author Administrator
 * 104.Maximum Depth of Binary Tree
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class MaximumDepthofBinaryTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public int maxDepth(TreeNode root) {
        if(root == null) 
    		return 0;
    	else
    		//返回左右子树中最大的那个再加�?
    		return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
    }
}
