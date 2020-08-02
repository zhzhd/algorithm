package com.zhzhd.structure.tree;
/**
 *@author zhangzhendong1
 *@date 2018/11/27
 *@package com.zhzhd.structure.tree
 *@describe
 **/
public class TreeNode {
    public int val;

    public TreeNode left,rigth;

    public TreeNode(int val){
        this.val = val;
        this.left = null;
        this.rigth = null;
    }
}