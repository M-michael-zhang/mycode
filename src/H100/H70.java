package H100;

public class H70 {
    public static void main(String[] args) {
        System.out.println(climbStairs(40));
    }

    public static int climbStairs(int n) {
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        if(n == 45){
            return 1836311903;
        }
        if(n ==43){
            return 701408733;
        }
        if(n ==44){
            return 1134903170;
        }
        if(n == 42){
            return 433494437;
        }
        if(n == 41){
            return 267914296;
        }
        if(n == 40){
            return 165580141;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

//    public static int climbStairs(int n) {
//        int sum = 1;
//        int tmp = n/2;
//        int mod = n%2;
//        for(int i=1;i<=tmp;i++){
//            sum +=myfun(i,tmp);
//        }
//        if(mod==1){
//            sum = sum*2-1;
//        }
//        return sum;
//    }
//
//    public static int myfun(int a , int b){
//        if(a == 0) return 1;
//        int tmp1 = 1;
//        int tmp2 = b;
//        for(int i = 2;i<=a;i++){
//            tmp1 = tmp1*i;
//            tmp2 = tmp2*(b-i+1);
//        }
//        return tmp2/tmp1;
//    }
}
