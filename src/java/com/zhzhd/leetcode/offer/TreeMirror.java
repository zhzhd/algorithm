package com.zhzhd.leetcode.offer;

import com.zhzhd.structure.tree.BinaryTreeNode;

/**
 * @Author zhzhd
 * @Date 2020-08-01
 * @Description
 */
public class TreeMirror {

    public BinaryTreeNode treeMirror(BinaryTreeNode root) {
        if (root == null || (root.leftNode == null && root.rightNode == null)) {
            return root;
        }

        BinaryTreeNode tempNode = root.leftNode;
        root.leftNode = root.rightNode;
        root.rightNode = tempNode;
        if (root.leftNode != null) {
            treeMirror(root.leftNode);
        }

        if (root.rightNode != null) {
            treeMirror(root.rightNode);
        }
        return root;
    }
}
