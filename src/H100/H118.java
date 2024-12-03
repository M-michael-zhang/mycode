package H100;

import java.util.ArrayList;
import java.util.List;

public class H118 {
    public static void main(String[] args) {
        List<List<Integer>> res = generate(30);
        for(List<Integer> list : res){
            System.out.print("<");
            for(Integer integer : list){
                System.out.print(integer + ",");
            }
            System.out.println(">");
        }
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> last = null;
        List<Integer> current = new ArrayList<>();
        current.add(1);
        last = current;
        res.add(last);
        for(int i = 2; i <= numRows; i++) {
            current = getCurFromLast(last,i);
            res.add(current);
            last = current;
        }
        return res;
    }

    public static List<Integer> getCurFromLast(List<Integer> last,int num) {
        List<Integer> res = new ArrayList<>();
        for(int i = 1; i <=num;i++) {
            if(i==1) {
                res.add(1);
                continue;
            }
            if(i==num) {
                res.add(1);
                continue;
            }
            res.add(last.get(i-2)+last.get(i-1));
        }
        return res;
    }

}
