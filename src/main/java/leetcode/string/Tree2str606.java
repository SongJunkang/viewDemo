package leetcode.string;

public class Tree2str606 {
    public String tree2str(TreeNode root) {

    StringBuffer stringBuffer = new StringBuffer();

    dotree2str(root,stringBuffer);

    return stringBuffer.toString();

    }

    private void dotree2str(TreeNode root, StringBuffer stringBuffer) {

        if (root != null){
            stringBuffer.append(root.val);

            if(root.left!=null && root.right != null){

                stringBuffer.append("(");

                dotree2str(root.left,stringBuffer);
                dotree2str(root.right,stringBuffer);

                stringBuffer.append(")");

            }
            if (root.left!=null && root.right == null){

            }

        }

    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
