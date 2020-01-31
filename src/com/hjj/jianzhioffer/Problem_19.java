package com.hjj.jianzhioffer;

/**
 * @author soberhjj  2020/1/28 - 11:29
 */
//题目：二叉树的镜像
//操作给定的二叉树，将其变换为源二叉树的镜像。
public class Problem_19 {
    public void Mirror(TreeNode root) {
        if (root == null)
            return;
        if (root.left != null || root.right != null) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
        Mirror(root.left);
        Mirror(root.right);
    }
}
