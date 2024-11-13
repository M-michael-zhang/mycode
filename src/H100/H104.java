package H100;

import java.util.ArrayList;
import java.util.List;

public class H104 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode head = root;
        root.left = null;
        root.right = new TreeNode(2);
        int result = maxDepth(head);
        System.out.println(result);
    }
    static int max = 0;
    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;
        myfunc(root,1);
        return max;
    }


    public static void myfunc(TreeNode root,int cur) {
        if(root == null) return;
        if(cur>max) max = cur;
        if(root.left!=null){
            myfunc(root.left,cur+1);
        }
        if(root.right!=null){
            myfunc(root.right,cur+1);
        }
    }
}
