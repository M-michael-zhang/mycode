package H100;

import java.util.List;

public class H226 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode head1 = root;
        TreeNode head2 = root;
        root.left = null;
        root.right = new TreeNode(2);
        invertTree(head1);
    }

    public static TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        if(root.left == null && root.right == null) return root;

        if(root.left !=null){
            invertTree(root.left);
        }
        if(root.right !=null){
            invertTree(root.right);
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }


}
