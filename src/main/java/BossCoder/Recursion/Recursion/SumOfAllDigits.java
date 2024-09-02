package BossCoder.Recursion.Recursion;

public class SumOfAllDigits {
    public static void main(String[] args) {
        int n=123;
//        System.out.println(sum(123,0));
        System.out.println(sum(123));
    }

    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n%10+sum(n/10);
    }

//    public static int sum(int n,int total){
//        if(n<=0){
//            return total;
//        }
//        return sum(n/10,total+n%10);
//    }



}
