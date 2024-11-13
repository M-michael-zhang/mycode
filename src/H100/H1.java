package H100;

public class H1 {
    public static void main(String[] args) {
        int[] nums = {1,6142,8192,10239};
        int target = 18431;
        int[] result = twoSum(nums, target);
        for(int o : result){
            System.out.println(o);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result = null;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    result = new int[]{i,j};
                }
            }
        }
        return result;
        //return twoSumPart(nums, target, 0, nums.length-1);
    }

    public static int[] twoSumPart(int[] nums, int target,int begin,int end) {

        int[] result = null;
        if(begin == end){
            return result;
        }
        int mid = (begin+end)/2;
        boolean flag = false;
        for(int a = begin; a<=mid;a++){
            for(int i = mid+1; i <= end; i++) {
                if(nums[a]+nums[i] == target) {
                    result = new int[2];
                    result[0] = a;
                    result[1] = i;
                    flag = true;
                    break;
                }
            }
            if(flag) break;
        }
        if(!flag){
            int[] tmp1 = twoSumPart(nums, target, begin,mid);
            if(tmp1 == null){
                return twoSumPart(nums, target,mid+1,end);
            }else{
                return tmp1;
            }

        }
        return result;
    }
}

