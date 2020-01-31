package com.hjj.jianzhioffer;

/**
 * @author soberhjj  2020/1/23 - 17:17
 */
//题目：树的子结构
//输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
public class Problem_18 {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root2 == null)
            return false;
        if (root1.val == root2.val) {
            return isSubtree(root1.left,root2.left)&&isSubtree(root1.right,root2.right);
        }
        return false;
    }

    public static boolean isSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null)
            return true;
        if (root1.val == root2.val)
            return isSubtree(root1.left, root2.left) && isSubtree(root1.right, root2.right);
        return false;
    }

}
