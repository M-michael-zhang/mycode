package H100;

public class H101 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode head = root;
        root.left = new TreeNode(2);
//        root.right = new TreeNode(2);
        root.right = new TreeNode(3);
//        root.right.right = new TreeNode(5);
        System.out.println(isSymmetric(root));
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSymmetric2(root.left, root.right);
    }

    public static boolean isSymmetric2(TreeNode left,TreeNode right) {
        if(left == null && right == null) return true;
        if(left ==null || right == null) return false;
        if(left.val != right.val) return false;
        if(left.left == null && right.right == null
                && left.right == null && right.left == null) return true;
        if(left.left == null && right.right != null) return false;
        if(left.right == null && right.left != null) return false;
        if(left.right != null && right.left == null) return false;
        if(left.left != null && right.right == null) return false;
        return isSymmetric2(left.left, right.right) && isSymmetric2(left.right, right.left);
    }
}
