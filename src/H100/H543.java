package H100;

public class H543 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        int result = diameterOfBinaryTree(root);
        System.out.println(result);
    }
    private static int ans = 0;
    public static int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return ans;
    }

    public static int dfs(TreeNode root) {
        if(root==null) return -1;
        int left = dfs(root.left)+1;
        int right = dfs(root.right)+1;
        ans = Math.max(ans,left+right);
        return Math.max(left,right);
    }

}
