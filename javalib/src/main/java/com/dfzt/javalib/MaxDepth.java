package com.dfzt.javalib;


import com.dfzt.javalib.struck.TreeNode;

public class MaxDepth {

    public static void main(String[] args) {


    }


    public int maxDepth(TreeNode root) {

        if(root==null){
            return 0;
        }

        return Math.max(maxDepth(root.left)+1,maxDepth(root.right)+1);
    }

}
