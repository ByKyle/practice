package cn.yk.practice.leetcode;

import cn.yk.practice.basic_object.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given a binary tree, find its minimum depth.
 * The minimum depth is the number of nodes along the shortest
 * path from the root node down to the nearest leaf node.
 * <p>
 * Definition for binary tree
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class MinimumDepthofBinaryTree {
    //    public int run(TreeNode root) {
//        if (root == null)
//            return 0;
//        int left = run(root.left);
//        int right = run(root.right);
//        if (root.left == null || root.right == null) {
//            return 1 + right + left;
//        } else {
//            return (left < right ? left : right) + 1;
//        }
//    }

    public int run(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        int depth = 0;
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()) {
            depth++;
            int length = nodeQueue.size();
            for (int i = 0;i<length;i++){
                TreeNode currentNode = nodeQueue.poll();
                if (currentNode.left!=null)
                    nodeQueue.add(currentNode.left);
                if (currentNode.right!=null)
                    nodeQueue.add(currentNode.right);
                if (currentNode.left==null&&currentNode.right==null)
                    return depth;
            }
        }
        return depth;
    }

    public static void main(String[] args) {

    }
}
