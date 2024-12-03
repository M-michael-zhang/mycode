package H100;

public class H35 {

    public static void main(String[] args) {
        int[] nums = {1,3};
        System.out.println(searchInsert(nums,3));
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        return mySearch(nums, target, left, right);

    }

    public static int mySearch(int[] nums, int target,int left,int right) {
        int mid = (left + right) / 2;
        if(nums[mid] == target){
            return mid;
        }
        if(mid==left){
             if(nums[mid]>=target){
                 return mid;
             }else if(nums[right]>=target){
                 return mid+1;
             }else{
                 return right+1;
             }
        }

        if(nums[mid]<target){
            if(mid!=nums.length-1 &&nums[mid+1] >target){
                return mid+1;
            }else{
                return mySearch(nums, target, mid,right);
            }
        }
        if(nums[mid]>target){
            if(mid!=0 && nums[mid-1] <target){
                return mid;
            }else{
                return mySearch(nums, target, left,mid);
            }
        }
        return mid;
    }
}
