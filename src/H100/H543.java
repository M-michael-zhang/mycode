package H100;

import java.util.ArrayList;
import java.util.List;

public class H543 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        //root.right = new TreeNode(3);
        //root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        int result = diameterOfBinaryTree(root);
        System.out.println(result);
    }
    public static int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        List<Integer> list = new ArrayList<>();
        myfun(root, list);
        int max = 0;
        int i = 0;
        int index = 0;
//        while(true){
//            if(i==list.size()-1){
//                if(list.get(i)==0) list.remove(i);
//                break;
//            }
//            if(list.get(i)==0) list.remove(i);
//            if(list.get(i)!=0) i++;
//        }
        for(i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
            if(list.get(i) > max){
                max = list.get(i);
                index = i;
            }
        }
        return max;

    }

    public static void myfun(TreeNode root, List<Integer> res) {
        if (root.left == null){
            //res.add(0);
        }else{
            myfun(root.left, res);
        }

        if(root.right == null){
            //res.add(0);
        }else{
            myfun(root.right, res);
        }

        if(root.left == null && root.right == null){
            res.add(1);
        }else if(root.left != null && root.right != null){
            int val = Math.max(res.get(res.size()-1), res.get(res.size()-2));
            res.add(val+1);
        }else{
            res.add(res.get(res.size()-1)+1);
        }

    }

}
