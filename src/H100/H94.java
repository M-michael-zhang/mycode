package H100;

import java.util.ArrayList;
import java.util.List;

public class H94 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode head = root;
        root.left = null;
        root.right = new TreeNode(2);
        List<Integer> result = inorderTraversal(head);
    }
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        myinorderTraversal(root,res);
        return res;
    }

    public static List<Integer> myinorderTraversal(TreeNode root,List<Integer> res) {
        if(root == null) return res;
        if(root.left!=null){
            myinorderTraversal(root.left,res);
        }
        res.add(root.val);
        if(root.right!=null){
            myinorderTraversal(root.right,res);
        }
        return res;
    }
}
