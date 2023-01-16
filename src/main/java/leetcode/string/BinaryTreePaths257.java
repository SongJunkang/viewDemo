package leetcode.string;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths257 {


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static List<String> binaryTreePaths(TreeNode root) {


        List<String > ret = new ArrayList<>();

        if (root == null) {
            return ret;
        }
        pathsHandler(root,"",ret);

        return ret;

    }

    private static void pathsHandler(TreeNode root, String cur, List<String> ret) {

        if (root ==null)
        {
            return;
        }

//        cur += root.val;
        cur = cur + root.val;

        if (root.left == null && root.right == null) {

            ret.add(cur);

        }
        else {
            pathsHandler(root.left,cur+"->",ret);
            pathsHandler(root.right,cur+"->",ret);

        }
    }

    public static void main(String[] args) {


        TreeNode root = new TreeNode(1);

        root.right = new TreeNode(2);

        root.left = new TreeNode(3);


        List<String> list = BinaryTreePaths257.binaryTreePaths(root);

        System.out.println("list = " + list);


    }

}
