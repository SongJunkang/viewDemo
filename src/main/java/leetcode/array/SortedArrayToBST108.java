package leetcode.array;


public class SortedArrayToBST108 {

    public TreeNode sortedArrayToBST(int[] nums) {

        return buildTree(nums,0,nums.length-1);

    }

    private TreeNode buildTree(int[] nums, int left, int right) {

        if (left > right){
            return null;
        }
        int mid = left + (right -left)/2;//防止越界。

        TreeNode root = new TreeNode(nums[mid]);

        root.left = buildTree(nums,left,mid-1);

        root.right = buildTree(nums,mid+1,right);


        return root;


    }

    public class TreeNode {
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
