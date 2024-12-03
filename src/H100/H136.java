package H100;

import java.util.HashSet;

public class H136 {
    public static void main(String[] args) {
        int[] arr = {1,23,4,5,4,23,1};
        System.out.println(singleNumber(arr));

    }

    public static int singleNumber(int[] nums) {
        int result =0;
        for (int num : nums) {
            result ^=num;
        }
        return result;
    }
}
