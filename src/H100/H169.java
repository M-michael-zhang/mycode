package H100;

import java.util.HashMap;
import java.util.HashSet;

public class H169 {
    public static void main(String[] args) {
        //majorityElement
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int middle = nums.length/2;

        for (int num : nums) {
            int size = map.getOrDefault(num,0) + 1;
            if(size>middle){
                return num;
            }
            map.put(num,size);
        }
        return 0;
    }
}
